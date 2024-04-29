package Übung_PR2_Hofer.Beispiele.Konto;

public class JugendGiroKonto extends GiroKonto {
    protected double buchungslimit;

    public JugendGiroKonto(String inhaber, double limit, double buchungslimit) {
        super(inhaber, limit);
        this.buchungslimit = buchungslimit;
    }

    public double getBuchungslimti() {
        return buchungslimit;
    }

    @Override
    public void einzahlen(double wert) {
        super.einzahlen(wert);
    }

    @Override
    public double auszahlen(double wert) {
        if (kontostand - wert >= -limit) {
            double abhebung = Math.min(wert, buchungslimit);
            kontostand -= abhebung;
            return abhebung;
        }else {
            // Falls der angeforderte Betrag den maximalen Überziehungsbetrag überschreitet,
            // wird keine Auszahlung durchgeführt und 0 wird als Rückgabewert geliefert
            System.out.println("Überziehung nicht möglich. Maximales Limit erreicht.");
            return 0.0;
        }
    }
}


