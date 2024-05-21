package Übung_PR2_Hofer.Beispiele.Kindergarten;

import java.util.Comparator;

public class AlphabeticalComparator implements Comparator <Kind> {
    @Override
    public int compare(Kind o1, Kind o2) {
        String o1Name = o1.getZname() + " " + o1.getVname();
        String o2Name = o2.getZname() + " " + o2.getVname();

        int nameComparison = o1Name.compareTo(o2Name);


        if (nameComparison != 0) {
            // Wenn die Namen unterschiedlich sind, geben Sie den Vergleich der Namen zurück
            return nameComparison;
        } else {
            // Wenn die Besitzer gleich sind, vergleichen Sie das Alter
            return Double.compare(o1.getAge(), o2.getAge());
        }
    }
}
