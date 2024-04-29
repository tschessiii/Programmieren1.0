package Übung_PR2_Hofer.Beispiele.Getränke;

public class LongDrink extends Getraenk{
    private Fluessigkeit spirituose;
    private Fluessigkeit filler;

    public LongDrink(String name, Fluessigkeit spirituose, Fluessigkeit filler) {
        super(name);
        this.spirituose = spirituose;
        this.filler = filler;
    }

    @Override
    int getAnzahlZutaten() {
        return 2;
    }

    @Override
    boolean beinhaltetAlkohol() {
        return spirituose.getAlkoholProzent() >0.3 || filler.getAlkoholProzent() >0.3;
    }

    @Override
    double mengeInMl() {
        return spirituose.getMenge() + filler.getMenge();
    }

    @Override
    public boolean brennt() {
        return spirituose.getAlkoholProzent() > 0.3 || filler.getAlkoholProzent() > 0.3;
    }
}
