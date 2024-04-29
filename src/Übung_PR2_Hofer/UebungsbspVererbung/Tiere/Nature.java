package Übung_PR2_Hofer.UebungsbspVererbung.Tiere;

import java.util.ArrayList;
import java.util.List;

public class Nature {
    protected ArrayList<Animal> animals;

    public Nature(ArrayList animals) {
        this.animals = new ArrayList<>(animals);
    }

    public ArrayList getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList animals) {
        this.animals = animals;
    }

    public void addAnnimal(Animal a){
        animals.add(a);
    }

    public int countColor(String color){
        int count = 0;
        for (Animal animal: animals){
            if(animal.getColor().equals(color)){
                count++;
            }
        }
        return count;
    }




}
