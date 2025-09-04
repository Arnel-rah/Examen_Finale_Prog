package frais;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;

@Getter
@AllArgsConstructor
public class Frais {
private final int id;
private final String label;
private final double montant;
private final Instant deadline;


}
