package fr.univamu.iut.exo3;

import fr.univamu.iut.Conteneur;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.TreeSet;

public class Chargement {
    private ArrayDeque<Conteneur> conteneurs;


    public ArrayDeque<Conteneur> getConteneurs() {
        return conteneurs;
    }

    public Chargement(TreeSet<Conteneur> conteneurs){
        this.conteneurs = new ArrayDeque<Conteneur>(conteneurs);
    }

    public Conteneur decharger(){

        return conteneurs.pop();
    }

    public void charger(Conteneur conteneur){
        conteneurs.push(conteneur);
    }



}
