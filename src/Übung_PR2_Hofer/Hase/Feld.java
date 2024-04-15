package Übung_PR2_Hofer.Hase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Feld {
    public static void main(String[] args) {
        Osterhase o = new Osterhase("Herbert",44,24);
        Weihnachtshase w = new Weihnachtshase("Schubert", 12,233);
        Hasenstall h = new Hasenstall();

        o.versteckeOstereier();
        w.verteileGeschenke();
        h.addHase(o);
        h.addHase(w);
        h.alleHasenHoppeln();
        o.fressen("Karotten mit Schokosauce");

        System.out.println("------------");
        h.addHase(new Hase("Bunni", 24, 102));
        h.hoppelSpecial();



        List<Hase> hasenListe = new ArrayList<>();
        hasenListe.add(new Hase("hasi",12,33));
        hasenListe.add(new Hase("bernd",1,45));
        hasenListe.add(new Hase("bernie",1,100));
        hasenListe.add(new Hase("malia",342,32));

        Collections.sort(hasenListe, new HaseAlterKarotteComparator());
        System.out.println(hasenListe.toString());






    }
}
