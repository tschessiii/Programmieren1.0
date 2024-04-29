package Übung_PR2_Hofer.Beispiele.Getränke;

public class SimplesGetränk extends Getraenk {
    private Fluessigkeit bestandteil;

    public SimplesGetränk(String name, Fluessigkeit bestandteil) {
        super(name);
        this.bestandteil = bestandteil;
    }

    @Override
    public boolean brennt() {
        return bestandteil.getAlkoholProzent() > 0.3;
    }

    @Override
    int getAnzahlZutaten() {
        return 1;
    }

    @Override
    boolean beinhaltetAlkohol() {
        return bestandteil.getAlkoholProzent() >0.3 ;
    }

    @Override
    double mengeInMl() {
        return bestandteil.getMenge();
    }


}
