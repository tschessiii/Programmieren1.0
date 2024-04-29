package Übung_PR2_Hofer.Beispiele.Land;

import java.util.ArrayList;

public class Bundesstaat extends Land{

    protected ArrayList<Land> laender;

    public Bundesstaat() {
        this.laender = new ArrayList<>();
    }

    public void addLand(Land l){
        laender.add(l);
    }

    @Override
    public double getBiP() {
        double summe = 0;
        for (Land land : laender) {
            summe += land.getBiP();
        }
        return summe;
    }
}
