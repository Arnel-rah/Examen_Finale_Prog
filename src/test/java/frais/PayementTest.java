package frais;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

class PayementTest {
@BeforeAll
    static void setUpBeforeClass() {
    List <String> fraisList = new ArrayList<>();
    fraisList.add(1,"Janvier");
    fraisList.add(2,"fevrier");
    List <String> etudiant = new ArrayList<>();
    etudiant.add("Alex");
    etudiant.add("Jan");
    Payement payementUn = new Payement(1,450000, Instant.now(),);
    Frais frais = new Frais(1,"frais",500000, Instant.now());
    Groupes groupes = new Groupes(1, "K2", etudiant);
    Etudiants etudiantsUn = new Etudiants("STD24000", "Kelly", "James", Instant.now(),groupes, );
}

    @Test
    void testPayementNull() {
    Payement payementUn = new Payement(1,450000, Instant.now(),null);
        assertThrows(IllegalArgumentException.class, () -> payementUn.payementTotalParEtudiant(null),
                "Doit lancer une exception si l'etudiant est null.");
    }
}