package Übung_PR2_Hofer.Generics;

import Übung_PR2_Hofer.Hase.Osterhase;
import Übung_PR2_Hofer.Vererbung.Perser;
import Übung_PR2_Hofer.Vererbung.Person;

public class MaybeMain {
    public static void main(String[] args) {


        Maybe<Osterhase> osterhaseMaybe = new Maybe<>(new Osterhase("lilo", 12,22),4);

        Osterhase bunnyref = osterhaseMaybe.getValueIfAllowed();
        System.out.println(bunnyref);




    }
}
