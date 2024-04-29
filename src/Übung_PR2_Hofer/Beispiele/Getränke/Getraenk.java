package Übung_PR2_Hofer.Beispiele.Getränke;

public abstract class Getraenk implements Brennbar{
    protected String name;

    public Getraenk(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Getränk:"+name+" Anzahl der Zutaten:"+getAnzahlZutaten()+" Beinhaltet Alkohol?:"+beinhaltetAlkohol()+ " Brennbar?: "+brennt();
    }

    abstract int getAnzahlZutaten();
    abstract boolean beinhaltetAlkohol();
    abstract double mengeInMl();

}
