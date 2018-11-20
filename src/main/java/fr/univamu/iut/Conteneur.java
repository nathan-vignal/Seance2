package fr.univamu.iut;

import fr.univamu.iut.exo2.GestionDistances;

import java.io.Serializable;

public class Conteneur implements Serializable {

    private static final long serialVersionUID = 1L;

    private String expediteur;
    private int poids;
    private String destination;

    public Conteneur(String expediteur, int poids, String destination) {
        this.expediteur = expediteur;
        this.poids = poids;
        this.destination = destination;
    }

    public Integer getDistance(){
       return  GestionDistances.getDistance(destination);
    }

    @Override
    public String toString() {
        return "Conteneur expédié par la société " +
                expediteur +
                ", de poids " + poids +
                " et à destination de " + destination;
    }
}
