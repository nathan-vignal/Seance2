package fr.univamu.iut.exo5;

import fr.univamu.iut.Conteneur;

public class TarifPoids implements Tarif{


    public static double calculPrix(Conteneur conteneur){

        return conteneur.getPoids() * 10;
    }
}
