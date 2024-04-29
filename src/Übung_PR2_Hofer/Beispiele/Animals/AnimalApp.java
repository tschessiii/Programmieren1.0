package Übung_PR2_Hofer.Beispiele.Animals;

import java.util.ArrayList;

public class AnimalApp {
    public static void main(String[] args) {
        Frog frog = new Frog("blue", 2);
        Cat cat = new Cat("Brown",2,"Kitty");
        Dog dog = new Dog("Black", 2, "Bello");
        Lion lion = new Lion("yellow",2);

        //Neue Istanz für die ArrayList
        Nature nature = new Nature();

        //ArrayList befüllen
        nature.addAnimal(new Animal("orange", 2));
        nature.addAnimal(new Animal("blau", 4));
        nature.addAnimal(new Animal("pink", 2));

        //Ausgabe
        System.out.println("Number of orangen tieren: " + nature.countColor("orange"));


        //Testen der Methoden
        frog.makeNoise();
        cat.makeNoise();
        dog.makeNoise();
        lion.makeNoise();
        lion.roar();

        System.out.println("--------------------------------------------------------------------");

        //Testen der Methoden
        frog.walk();
        cat.walk();
        dog.walk();
        lion.walk();
    }
}
