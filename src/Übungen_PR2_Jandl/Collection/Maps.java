package Übungen_PR2_Jandl.Collection;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {

        //create HashMap
        Map<Integer, String> map = new HashMap<>();


        //add values to HashMap
        map.put(1,"Eins");
        map.put(2,"Zwei");
        map.put(3,"Drei");
        map.put(4,"Vier");


        //show values in map
        for (Integer i: map.keySet()) {
            System.out.println("Key: "+i+" Value:  "+map.get(i));
        }

        //delete values
        map.remove(2);

        for (Integer i: map.keySet()) {
            System.out.println("Key: "+i+" Value:  "+map.get(i));
        }

        //irritate over values
        for (String s : map.values()) {
            if(s.contains("r")){
                System.out.println(s);
            }
        }

    }
}
