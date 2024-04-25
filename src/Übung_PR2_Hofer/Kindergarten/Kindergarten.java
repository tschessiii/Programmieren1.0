package Übung_PR2_Hofer.Kindergarten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kindergarten {

    private String klasse;
    private List<Kind> kinder;

    public Kindergarten(String klassenName) {
        this.klasse = klassenName;
        kinder = new ArrayList<Kind>() {
        };
    }

    //Constructor
    public String getKlasse() {
        return klasse;
    }

    public List<Kind> getKinder() {
        return kinder;
    }

    //NeueMethode
    public void addKind(Kind k){
        kinder.add(k);
    }

    //Sortier Methode
    public void sortAlphabetical(){
        Collections.sort(kinder, new AlphabeticalComparator());
    }

    public void sortAge(){
        Collections.sort(kinder, new AgeComparator());
    }
}
