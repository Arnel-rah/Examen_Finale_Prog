package frais;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.time.Instant;


@Getter
@AllArgsConstructor
public class Payement {
    private final int id;
    private final double montant;
    private final Instant dateDePayement;
    private final List <Frais> frais;


    public List<Frais> fraisEnRetardEnTempsDonnee(List <Frais> frais, Instant t) {
        return frais.stream()
                .filter(f -> f.getDeadline().isAfter(t)).toList();
    }

    public double montantEnRetard(List<Frais> frais, Instant t){
        return frais.stream()
                .filter(f -> f.getDeadline().isAfter(t)).
                mapToInt(s -> (int) s.getMontant()).sum();
    }

    public double payementTotalParEtudiant(Etudiants etudiants, List<Frais> frais, Instant t){
        return frais.stream().map(Frais::getMontant).reduce(0.0, Double::sum);
    }

    public void statusDePayement(List <Frais> frais, Instant t){
        if (frais.stream().map(Frais::getDeadline).
                filter(deadline -> deadline.isBefore(t)).isParallel()){
            System.out.println("en cours");
        } else if (frais.stream().map(Frais::getMontant).reduce(0.0, Double::sum) >= montant) {
            System.out.println("payé");
        } else if (frais.stream()
                .filter(f -> f.getDeadline().isAfter(t)).map((frais.getMontant()).reduce(0.0, Double::sum))) {
            System.out.println("en retard");
        } else {
            System.out.println("en surplus");
        }
    }

}
