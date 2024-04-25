package Übung_PR2_Hofer.Beispiele.Animals;

public class Frog extends Animal {

    public Frog(String color, int countEyes) {
        super(color, countEyes);
    }

    @Override
    public void walk() {
        System.out.println("Jumpning");;
    }

    @Override
    public void makeNoise() {
        System.out.println("Quack Quack");;
    }
}
