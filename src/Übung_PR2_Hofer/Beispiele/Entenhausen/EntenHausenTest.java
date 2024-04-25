package Übung_PR2_Hofer.Beispiele.Entenhausen;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class EntenHausenTest {

    public static void main(String[] args) {
        EntenHausen entenHausen = new EntenHausen();


        entenHausen.addEnte(new BadeEnte("Daisy", 100, 20));
        entenHausen.addEnte(new BadeEnte("Donald", 100, 15));
        entenHausen.addEnte(new FlugEnte("Tick", 40, 20));
        entenHausen.addEnte(new FlugEnte("Trick", 20, 20));
        entenHausen.addEnte(new FlugEnte("Track", 40, 25));

        Map<Integer, List<Ente>> h = entenHausen.getGruppierteEnte();

        for(Integer i : h.keySet()) {
            System.out.println(i);

            System.out.println(h.get(i));

            Collections.sort(h.get(i));

            System.out.println(h.get(i));
        }
    }
}
