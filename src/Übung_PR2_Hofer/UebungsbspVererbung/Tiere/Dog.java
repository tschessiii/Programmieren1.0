package Übung_PR2_Hofer.UebungsbspVererbung.Tiere;

public class Dog extends Animal {
    protected String name;


    public Dog(String color, int countEyes, String name) {
        super(color, countEyes);
        this.name = name;
    }

    @Override
    public void walk() {
        System.out.println("Der Hund lauft davon.");
    }

    @Override
    public void makeNoise() {
        System.out.println("Wuff, Wuff macht der Hund!");
    }
}
