package Programmiere_2_Hofer.Sortieren;

import Programmiere_2_Hofer.Vererbung.Dog;
import Übungen_PR1.Arrays.Array;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        int[] zahli = {1,2,77,3}; // new int[10]

        //Erste Methode zum Ausgeben
        for (int zahl: zahli) {
            System.out.println(zahl);
        }

        //Zweite Methode zum Ausgeben
        System.out.println(Arrays.toString(zahli));



        //Hilfsmethode zum Sortieren - das Sortieren selbst ist schon umgesetzt
        Arrays.sort(zahli);
        System.out.println(Arrays.toString(zahli));

        //Ein String Array sortieren
        String[] stringi = {"Hansi","Anna","Tom","Steffi","X AE A-12"};
        Arrays.sort(stringi);
        System.out.println(Arrays.toString(stringi));

        //Geht das auch mit eigenen Objekten
        //nein noch nicht da Java nicht weiß wie wir Hunde sortieren wollen
        Dog [] dogs= {new Dog("Hansi",19 )};
        //Arrays.sort(dogs); //geht noch nicht





    }
}
