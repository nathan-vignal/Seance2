package fr.univamu.iut.exo3;
import fr.univamu.iut.Conteneur;
import fr.univamu.iut.exo2.*;
import fr.univamu.iut.exo1.*;

import java.util.TreeSet;

public class GestionExpeditions {
    public static void main(String[] args) {
        TreeSet<Conteneur> conteneurs = (TreeSet<Conteneur>) Lecteur.charger("Conteneurs.ser");

        Chargement chargement = new Chargement(conteneurs);
        Conteneur nouveau = new Conteneur("mars",1500,"Malaga");
        System.out.println(chargement.decharger());
        chargement.charger(nouveau);
        System.out.println(chargement.getConteneurs());
    }
}
