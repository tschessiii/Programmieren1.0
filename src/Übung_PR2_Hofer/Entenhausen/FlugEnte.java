package Übung_PR2_Hofer.Entenhausen;

import java.util.Comparator;

public class FlugEnte extends Ente {
    protected int gewichtFedern;

    public FlugEnte(String name, int gewicht, int gewichtFedern) {
        super(name, gewicht);
        this.gewichtFedern = gewichtFedern;
    }

    @Override
    public int getfullWeight() {
        return gewicht+gewichtFedern;
    }

    @Override
    public String makeNoise() {
        return "Quack "+name+" "+getfullWeight();
    }

    @Override
    public String toString() {
        return makeNoise();
    }
}
