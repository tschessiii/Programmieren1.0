package Übung_PR2_Hofer.Instrumente;

public class Pauke extends Instrument{

    public Pauke(int lautstaerke) {
        super(lautstaerke);
    }

    @Override
    public int play() {
        System.out.println("Die Pauke wird geschlagen");
        return lautstaerke;
    }
}
