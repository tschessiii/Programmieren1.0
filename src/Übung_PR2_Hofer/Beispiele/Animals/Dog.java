package Übung_PR2_Hofer.Beispiele.Animals;

public class Dog extends Animal{

    protected String name;
    public Dog(String color, int countEyes, String name) {
        super(color, countEyes);
        this.name = name;
    }

    @Override
    public void walk() {
        System.out.println("Running");
    }

    @Override
    public void makeNoise() {
        System.out.println("Wuff Wuff");
    }

    public void roar(){

    }
}
