package Übung_PR2_Hofer.Entenhausen;

public abstract class Ente implements Comparable<Ente>{

    protected String name;
    protected int gewicht;

    public Ente(String name, int gewicht) {
        this.name = name;
        this.gewicht = gewicht;
    }

    public abstract int getfullWeight();
    public abstract String makeNoise();

    @Override
    public int compareTo(Ente o) {
        return Integer.compare(getfullWeight(), o.getfullWeight());
    }
}
