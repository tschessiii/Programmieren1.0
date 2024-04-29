package Übung_PR2_Hofer.Beispiele.Konto;

import org.w3c.dom.ls.LSOutput;

public class Konto {
    protected String Inhaber;
    protected double kontostand;

    public Konto(String inhaber) {
        Inhaber = inhaber;
        this.kontostand = 0;
    }


    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    public void einzahlen(double wert) {
        kontostand += wert;
    }

    public double auszahlen(double wert) {
        if (kontostand >= wert) {
            kontostand -= wert;
            return wert;
        }  else {
            // Falls der angeforderte Betrag größer als der Kontostand ist,
            // wird der gesamte Kontostand ausgezahlt und als Rückgabewert geliefert
            double auszahlung = kontostand;
            kontostand = 0.0;
            return auszahlung;
        }
    }

}


