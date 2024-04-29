package Übung_PR2_Hofer.Beispiele.Getränke;

public class Fluessigkeit {

    protected String name;
    protected double menge;
    protected double alkoholProzent;

    public Fluessigkeit(String name, double menge, double alkoholProzent) {
        this.name = name;
        this.menge = menge;
        this.alkoholProzent = alkoholProzent;
    }

    public String getName() {
        return name;
    }

    public double getMenge() {
        return menge;
    }

    public double getAlkoholProzent() {
        return alkoholProzent;
    }
}
