package Übung_PR2_Hofer.Instrumente;

public class Gitarre extends Instrument {

    public Gitarre(int lautstaerke) {
        super(lautstaerke);
    }

    @Override
    public int play() {
        System.out.println("Gittare wird gespielt");
        return lautstaerke;
    }
}
