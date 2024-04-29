package Übung_PR2_Hofer.Beispiele.Konto;

public class SparKonto extends Konto{
    public SparKonto(String inhaber) {
        super(inhaber);
    }



    @Override
    public void einzahlen(double wert) {
        super.einzahlen(wert);
    }

    @Override
    public double auszahlen(double wert) {
        if(kontostand - wert >= 0){
           kontostand -=wert;
            return wert;
        }else {
            System.out.printf("Auszahlung fehlgeschlagen!");
        }
        return 0;
    }
}
