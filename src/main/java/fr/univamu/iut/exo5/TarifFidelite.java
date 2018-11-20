package fr.univamu.iut.exo5;

import fr.univamu.iut.Conteneur;

public class TarifFidelite implements Tarif{

    public double calculPrix(Conteneur conteneur){
        TarifPoids tarifPoids = new TarifPoids();
        return tarifPoids.calculPrix(conteneur) * 0.8 ;
    }


}