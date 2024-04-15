package Übungen_PR2.Collection;

import java.util.ArrayList;
import java.util.List;

public class MainZuAnimals {

    //Typ der Liste muss sich in der Eingabe anpassen
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Bunny","Hase",AnimalType.MAMMAL));
        animalList.add(new Animal("Brathuhn","Krähe",AnimalType.BIRD));
        animalList.add(new Animal("Kizu","Schlange",AnimalType.REPTILE));
        animalList.add(new Animal("Basti","Fisch",AnimalType.FISH));
        animalList.add(new Animal("Memi","Spinne",AnimalType.INSECT));


        //Aufgabe in einer For Each Schleife um alles in einer eigenen Reihe zu haben.
        //Animal ist der Datentyp
        for(Animal animal :  animalList){
            System.out.println(animal);
        }
        System.out.println("----------------------------------");

        //Nur den Namen ausgeben der Programmiere_2_Hofer.UebungsbspVererbung.Tiere:
        for (Animal animal : animalList){
            System.out.println(animal.getName());
        }




    }
}
