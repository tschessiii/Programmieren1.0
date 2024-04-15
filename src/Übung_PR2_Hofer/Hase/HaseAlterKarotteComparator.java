package Übung_PR2_Hofer.Hase;

import java.util.Comparator;

public class HaseAlterKarotteComparator implements Comparator<Hase> {


    @Override
    public int compare(Hase o1, Hase o2) {
        int cmp = Integer.compare(o1.getAlter(), o2.getAlter());
        if(cmp != 0){
            return cmp;
        }

        return Integer.compare(o1.getKarotten(),o2.getKarotten());

    }
}
