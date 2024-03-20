package Übungen_PR2.Collection;

public class Animal {

    private String name;
    private String species;
    private AnimalType animalType;

    public Animal(String name, String species, AnimalType animalType) {
        this.name = name;
        this.species = species;
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    @Override
    public String toString() {
        return "Name:"+name+" |Spezies:"+species+" |Typ:"+animalType;
    }
}
