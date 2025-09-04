package frais;

import java.time.Instant;
import java.util.List;

public class PayementOrangeMoney extends Payement{

    public PayementOrangeMoney(int id, double montant, Instant dateDePayement, List<Frais> frais) {
        super(id, montant, dateDePayement, frais);
    }
}
