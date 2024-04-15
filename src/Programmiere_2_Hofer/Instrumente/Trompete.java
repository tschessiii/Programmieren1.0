package Programmiere_2_Hofer.Instrumente;

public class Trompete extends Instrument{

    public Trompete(int lautstaerke) {
        super(lautstaerke);
    }

    @Override
    public int play() {
        System.out.println("Die Trompete wird geblasen.");
        return lautstaerke;
    }
}
