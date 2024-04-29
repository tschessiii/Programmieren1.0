package Übung_PR2_Hofer.Beispiele.Getränke;

import java.util.ArrayList;

public class Cocktail extends Getraenk{
    private ArrayList<Fluessigkeit> bestandteile;

    public Cocktail(String name) {
        super(name);
    }

    @Override
    int getAnzahlZutaten() {
        return 0;
    }

    @Override
    boolean beinhaltetAlkohol() {
        return false;
    }

    @Override
    double mengeInMl() {
        return 0;
    }

    @Override
    public boolean brennt() {
        return false;
    }
}
