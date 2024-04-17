package Übung_PR2_Hofer.Property;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Property> properties = new ArrayList<>();

        properties.add(new Property("Hansi",100.0001));
        properties.add(new Property("Anna",1000.42));
        properties.add(new Property("Hansi",50.2));


        //Es wird in Collections sortiert
        //für arrays verwenden wir Arrays.sort()
        Collections.sort(properties, new AreaComparator());

        System.out.println(properties);

        //Sortieren jetzt mit dem comparable interface (>aufsteigend)
        Collections.sort(properties);
        System.out.println(properties);

        //Verwenden den Comparator- sortieren in die andere Richtung
        Collections.sort(properties, new AreaComparator().reversed());
        System.out.println(properties);

        //exkurs: ? :operator - "kurz geschriebenes if"
        int x = 5;

        //if bedingung ? Anweisung falls true : Anweisung falls false
        int y = (x<10)? 2 : 1;

        //das ist das selbe
        if(x<10){
            y=2;
        }else {
            y=1;
        }









    }
}
