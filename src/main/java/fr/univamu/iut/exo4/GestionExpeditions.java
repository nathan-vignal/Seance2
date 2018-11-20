package fr.univamu.iut.exo4;

import fr.univamu.iut.Conteneur;
import fr.univamu.iut.exo1.Lecteur;
import fr.univamu.iut.exo3.Chargement;

import java.util.TreeSet;

public class GestionExpeditions {
    public static void main(String[] args) {

        TreeSet<Conteneur> conteneurs = (TreeSet<Conteneur>) Lecteur.charger("Conteneurs.ser");

        Chargement chargement = new Chargement(conteneurs);

        GestionMasse gestionMasse = new GestionMasse();
        gestionMasse.rangerParMasse(conteneurs);

    }
}
