package fr.univamu.iut.exo2;
import fr.univamu.iut.Conteneur;
import fr.univamu.iut.exo1.*;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class GestionDistances {

    private static HashMap<String, Integer> distances = new HashMap<String, Integer>();

    public static Comparator<Conteneur> comparator = new Comparator<Conteneur>() {
        @Override
        public int compare(Conteneur o1, Conteneur o2) {
            return o1.getDistance() - o2.getDistance() ;
        }
    };

    static {
        distances.put("Barcelone", 183);
        distances.put("Valence", 337);
        distances.put("Alicante", 399);
        distances.put("Malaga", 599);
    }


    public static Integer getDistance(String ville) {
        return distances.get(ville);
    }


}