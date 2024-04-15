package Übung_PR2_Hofer.Vererbung;

import java.util.Comparator;

//ganz oft wollen wir auf basis mehrer attribute sortieren
//hier zuerst nach alter und falls gleich
//nach Name aufsteigen
public class DogAgeNameComparator implements Comparator<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {
        int cmp = Integer.compare(o1.getAlter(), o2.getAlter());
        if(cmp !=0){
            //alter ist schon unterschiedlich - Müssen namen nucht mehr
            return cmp;
        }

        //falls alter gleich wäre
        return o1.getName().compareTo(o2.getName());
    }
}
