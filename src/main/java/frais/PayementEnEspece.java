package frais;

import java.time.Instant;
import java.util.List;

public class PayementEnEspece extends Payement{

    public PayementEnEspece(int id, double montant, Instant dateDePayement, List<Frais> frais) {
        super(id, montant, dateDePayement, frais);
    }
}
