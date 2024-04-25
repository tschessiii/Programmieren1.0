package Übung_PR2_Hofer.Beispiele.Entenhausen;

public class BadeEnte extends Ente {
    protected int gewichtWasser;

    public BadeEnte(String name, int gewicht, int gewichtWasser) {
        super(name, gewicht);
        this.gewichtWasser = gewicht;
    }


    @Override
    public int getfullWeight() {
        return gewicht + gewichtWasser;
    }

    @Override
    public String makeNoise() {
        return "Quitsch "+ name + " "+getfullWeight();
    }

    @Override
    public String toString() {
        return makeNoise();
    }
}
