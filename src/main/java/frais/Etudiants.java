package frais;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;
import java.util.List;

@Getter
@AllArgsConstructor
public class Etudiants {
    private final String id;
    private final String nom;
    private final String prenom;
    private final Instant dateDeRentrer;
    private Groupes groupe;
    private List<Payement> listPayement;
}


