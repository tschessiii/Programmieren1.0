package Übung_PR2_Hofer.Beispiele.Animals;
import java.util.ArrayList;
public class Nature {
    protected ArrayList<Animal> animals;


    public Nature(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public Nature() {
        animals = new ArrayList<Animal>();
    }
    public void addAnimal(Animal a)
    {
        animals.add(a);
    }
    public int countColor(String color)
    {
        int colorNr = 0;

        for (Animal a : animals)
        {
            if(a.color.equals(color))
            {
                ++colorNr;
            }
        }

        return colorNr;
    }
}

