package Übung_PR2_Hofer.Vererbung;

import java.util.Comparator;

public class DogAgeComaparator implements Comparator<Dog> {

    //aufsteigend nach Hundealter sortiert
    @Override
    public int compare(Dog o1, Dog o2) {
        return Integer.compare(o1.getAlter(), o2.getAlter());
    }
}
