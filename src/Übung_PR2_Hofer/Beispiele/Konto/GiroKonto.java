package Übung_PR2_Hofer.Beispiele.Konto;

public class GiroKonto extends Konto{

    protected double limit;

    public GiroKonto(String inhaber, double limit) {
        super(inhaber);
        this.limit = limit;
    }



    @Override
    public void einzahlen(double wert) {
        super.einzahlen(wert);
    }

    @Override
    public double auszahlen(double wert) {
        if(kontostand - wert >= -limit){
            kontostand -=wert;
            return wert;
        }else {
            System.out.println("Überziehung nicht möglich. Maximales Limit erreicht.");
            return 0.0;
        }
    }
}
