package fr.univamu.iut.exo1;

import fr.univamu.iut.Conteneur;

import java.util.ArrayList;

public class GestionExpeditions {
    public static void main(String[] args) {
        ArrayList<Conteneur> conteneurs = (ArrayList<Conteneur>)Lecteur.charger("Conteneurs.ser");
        System.out.println(conteneurs);



    }
}
