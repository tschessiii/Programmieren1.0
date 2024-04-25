package Übung_PR2_Hofer.Beispiele.Animals;

public class Lion extends Animal{

    public Lion(String color, int countEyes) {
        super(color, countEyes);
    }

    @Override
    public void walk() {
        System.out.println("Walking like a King!");
    }

    @Override
    public void makeNoise() {
        System.out.println("cough cough");
    }

    public void roar(){
        System.out.println("ROOOOOOOAR");
    }
}
