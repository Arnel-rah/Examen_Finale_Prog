package frais;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Groupes {
    private final int id;
    private final String nom;
    private List<String> listEtudiants;
}
