package Übung_PR2_Hofer.Beispiele.Animals;

public class AnimalApp {
    public static void main(String[] args) {
        Frog frog = new Frog("blue", 2);
        Cat cat = new Cat("Brown",2,"Kitty");
        Dog dog = new Dog("Black", 2, "Bello");
        Lion lion = new Lion("yellow",2);

        frog.makeNoise();
        cat.makeNoise();
        dog.makeNoise();
        lion.makeNoise();
        lion.roar();

        System.out.println("--------------------------------------------------------------------");

        frog.walk();
        cat.walk();
        dog.walk();
        lion.walk();
    }
}
