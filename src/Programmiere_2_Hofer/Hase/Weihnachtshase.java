package Programmiere_2_Hofer.Hase;

public class Weihnachtshase extends Hase{

    public Weihnachtshase(String name) {
        super(name);
    }

    public void verteileGeschenke(){
        System.out.println("Der Weihnachtshase "+ name + " verteilt jetzt Geschenke");
    }

}
