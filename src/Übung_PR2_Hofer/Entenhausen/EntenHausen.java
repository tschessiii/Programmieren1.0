package Übung_PR2_Hofer.Entenhausen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EntenHausen {
    private List<Ente> enten;

    public EntenHausen() {
        enten = new ArrayList<Ente>();
    }

    public void addEnte(Ente e){
        enten.add(e);
    }

    public Map<Integer, List<Ente>> getGruppierteEnte(){

        HashMap<Integer, List<Ente>> MapEnte = new HashMap<Integer, List<Ente>>();
        ArrayList<Ente> e100, e200, e300;

        e100 = new ArrayList<>();
        e200 = new ArrayList<>();
        e300 = new ArrayList<>();

        for (Ente e:enten){

            if (e.getfullWeight() <= 100) {

                e100.add(e);
                
            } else if (e.getfullWeight() >100 && e.getfullWeight() <= 200) {

                e200.add(e);
                
            }else if (e.getfullWeight() > 200 && e.getfullWeight() <= 300){

                e300.add(e);
            }

        }

        MapEnte.put(100, e100);
        MapEnte.put(200, e200);
        MapEnte.put(300, e300);
        return MapEnte;
    }
}
