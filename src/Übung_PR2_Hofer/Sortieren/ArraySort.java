package Übung_PR2_Hofer.Sortieren;

import Übung_PR2_Hofer.Vererbung.Dog;
import Übung_PR2_Hofer.Vererbung.DogAgeComaparator;
import Übung_PR2_Hofer.Vererbung.DogAgeNameComparator;
import Übung_PR2_Hofer.Vererbung.DogNameComparator;

import java.util.*;

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
        Dog [] dogs= {new Dog("Hansi",19 ), new Dog("Schnuffi",10), new Dog("Whisky", 5)};
        Arrays.sort(dogs);
        System.out.println(Arrays.toString(dogs));


        String hansi = "Hansi";
        String anna = "Anna";

        //Hansi ruft Methode von compareto auf - ist in der ausfürhung dieser Methode das this Objekt
        //Anna ist der erste Parameter
        hansi.compareTo(anna);

        System.out.println(hansi.compareTo(anna));

        //geht auch in collections
        List<Dog> dogslist= new ArrayList<>();

        dogslist.add(new  Dog("Hansi",19));
        dogslist.add(new  Dog("Schnuffi",15));
        dogslist.add(new  Dog("Whisky",41));

        //Sortieren in Collections
        Collections.sort(dogslist);
        System.out.println(dogslist);


        //Comparator testen
        dogslist.add( new Dog("Arnold",5));

        System.out.println("***Comparator Test***");
        Collections.sort(dogslist, new DogNameComparator());
        System.out.println(dogslist);

        //zweiten Comparator testen
        System.out.println("****ComparatorAge Test(aufsteigend)****");
        dogslist.add(new Dog("Puppy",0));
        Collections.sort(dogslist, new DogAgeComaparator());
        System.out.println(dogslist);

        //umgekehrt sortieren-holen uns einen reversed comparator
        Collections.sort(dogslist, new DogAgeComaparator().reversed());
        System.out.println(dogslist);

        dogslist.add(new Dog("Annabell",0));
        Collections.sort(dogslist, new DogAgeNameComparator());
        System.out.println(dogslist);





    }
}
