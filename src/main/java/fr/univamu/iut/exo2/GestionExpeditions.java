package fr.univamu.iut.exo2;
import fr.univamu.iut.Conteneur;
import fr.univamu.iut.exo1.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class GestionExpeditions {
    public static void main(String[] args) {


        TreeSet<Conteneur>conteneurs = (TreeSet<Conteneur>) Lecteur.charger("Conteneurs.ser");
        System.out.println(conteneurs);


    }
}
