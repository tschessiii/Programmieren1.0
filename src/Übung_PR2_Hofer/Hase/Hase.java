package Übung_PR2_Hofer.Hase;

public class Hase {
    protected String name;
    protected int alter;
    protected int karotten;

    public Hase(String name, int alter, int karotten) {
        this.name = name;
        this.alter = alter;
        this.karotten = karotten;

    }


    public int getAlter() {
        return alter;
    }

    public int getKarotten() {
        return karotten;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setKarotten(int karotten) {
        this.karotten = karotten;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void schlafen(){
        System.out.println(name + " ist jetzt am schlafen");
    }

    public void hoppeln(){
        System.out.println(name+ " hoppelt jetzt davon");
    }

    public void fressen(String essen){
        System.out.println(name + " isst jetzt "+ essen + ".");
    }

    @Override
    public String toString() {
        return "Hase{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                ", karotten=" + karotten +
                '}';
    }
}
