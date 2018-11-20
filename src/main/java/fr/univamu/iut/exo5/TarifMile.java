package fr.univamu.iut.exo5;

import fr.univamu.iut.Conteneur;

public class TarifMile implements Tarif{

    public double calculPrix(Conteneur conteneur){

        return conteneur.getDistance() * 200;
    }


}
