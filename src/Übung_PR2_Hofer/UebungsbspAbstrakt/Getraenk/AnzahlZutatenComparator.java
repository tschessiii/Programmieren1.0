package Übung_PR2_Hofer.UebungsbspAbstrakt.Getraenk;

public class AnzahlZutatenComparator extends Getraenk {


    public AnzahlZutatenComparator(String name) {
        super(name);
    }

    @Override
    public int getAnzahlZutaten() {
        return 0;
    }

    @Override
    public boolean beinhaltetAlkohol() {
        return false;
    }

    @Override
    public double mengeInMl() {
        return 0;
    }

    @Override
    public boolean brennt() {
        return false;
    }
}
