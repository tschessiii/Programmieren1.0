package Übungen_PR2.Collection;

import java.util.ArrayList;
import java.util.List;

public class ListAndMap {
    public static void main(String[] args) {

        //Eine Liste erstellen
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        //Liste ausgeben
        for(Integer i : integerList){
            System.out.println(i);
        }

        //Löscht in der Liste den Index 3
        integerList.remove(3);

        //Liste erneut Ausgeben
        System.out.println("-------------------------");
        for(Integer i: integerList){
            System.out.println(i);
        }


        List<String> stringList = new ArrayList<>();
        stringList.add("Hello its me.");
        stringList.add("I was wondering if after all-");
        stringList.add("-these years u would like to meet");

        System.out.println("----------------------------");

    }
}
