package fr.univamu.iut.exo4;

import fr.univamu.iut.Conteneur;

import java.util.Comparator;
import java.util.TreeSet;

public class GestionMasse {

    public TreeSet<Conteneur> getConteneurs() {
        return conteneurs;
    }

    private TreeSet<Conteneur> conteneurs = new TreeSet<Conteneur>(comparator);

    private static Comparator<Conteneur> comparator = new Comparator<Conteneur>() {
        @Override
        public int compare(Conteneur o1, Conteneur o2) {
            return o1.getPoids() - o2.getPoids() ;
        }
    };

    public void rangerParMasse(TreeSet<Conteneur> conteneursNonRange){
        System.out.println(conteneursNonRange);
        conteneurs.addAll(conteneursNonRange);
        System.out.println(conteneurs.size());

    }


}
