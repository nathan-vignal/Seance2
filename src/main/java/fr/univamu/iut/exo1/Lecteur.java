package fr.univamu.iut.exo1;

import fr.univamu.iut.Conteneur;
import fr.univamu.iut.exo2.GestionDistances;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ConnectException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class Lecteur {
    public static Collection<Conteneur> charger(String fichier) {

        TreeSet<Conteneur> listeConteneur = new TreeSet<Conteneur>(GestionDistances.comparator);
        try {
            FileInputStream fis = new FileInputStream(fichier);
            ObjectInputStream ois = new ObjectInputStream(fis);
            try {
                while (true) {
                    Conteneur conteneur = (Conteneur) ois.readObject();
                    listeConteneur.add(conteneur);

                }
            }catch(EOFException eof) {  // en fin de fichier

                return listeConteneur;
            }


        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        catch (ClassNotFoundException notFound){
            System.out.println("class not found");
            notFound.printStackTrace();
        }
        return null;
    }
}