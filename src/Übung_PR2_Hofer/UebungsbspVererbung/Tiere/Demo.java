package Übung_PR2_Hofer.UebungsbspVererbung.Tiere;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Frog quaxi = new Frog("grün",2);
        Animal quaxiAsAnimal = quaxi;
        Animal quaxi1 = (Frog) quaxiAsAnimal;

        //Erstellen einer Instanz der Natur-Klasse
        Nature nature = new Nature(new ArrayList<>());

        //Eingabe in die ArrayList
        nature.addAnnimal(new Animal("grün",2));
        nature.addAnnimal(new Animal("braun",2));
        nature.addAnnimal(new Animal("orange",2));
        nature.addAnnimal(new Animal("orange",3));
        nature.addAnnimal(new Frog("blau",2));

        //Ausgabe der ArrayList
        System.out.println("Number of braunen tieren: " + nature.countColor("braun"));
        System.out.println("Number of orangen tieren: " + nature.countColor("orange"));
        System.out.println("Number of grünen tieren: " + nature.countColor("grün"));
        System.out.println("Number of blauen tieren: " + nature.countColor("blau"));

        Dog d = new Dog("braun",2,"Doggo");
        d.makeNoise();
        d.walk();


    }
}