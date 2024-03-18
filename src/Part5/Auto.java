package Part5;

import org.w3c.dom.ls.LSOutput;

public class Auto {

    //Erstellen der Attribute
    private String marke;
    private String modell;
    private int jahr;
    private double geschwindigkeit;

    //Erstellen eines Konstruktors
    public Auto(String marke, String modell, int jahr) {
        this.marke = marke;
        this.modell = modell;
        this.jahr = jahr;
    }

//Erstellen von Getter und Setter
    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(double geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public  void gasGeben(double speed){
        geschwindigkeit= geschwindigkeit+speed;
    }

    public void bremsen(double speed){
        geschwindigkeit=geschwindigkeit-speed;
    }

    //Der toString für die Ausgabe
    @Override
    public String toString() {
        return "Marke: "+marke+", Modell: "+modell+", Jahr: "+jahr+", Geschwindigkeit: "+geschwindigkeit ;
    }
}