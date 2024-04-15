package Übung_PR2_Hofer.Vererbung;

import java.util.Comparator;

public class DogNameComparator implements Comparator<Dog> {


    //aufsteigend nach hundenamen sortiert
    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
