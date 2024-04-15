package Programmiere_2_Hofer.Instrumente;

public abstract class Instrument {
    protected int lautstaerke;

    public abstract int play();

    public Instrument(int lautstaerke) {
        this.lautstaerke = lautstaerke;
    }


    public int getLautstaerke() {
        return lautstaerke;
    }

    public void setLautstaerke(int lautstaerke) {
        this.lautstaerke = lautstaerke;
    }
}
