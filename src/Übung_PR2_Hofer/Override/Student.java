package Übung_PR2_Hofer.Override;

public class Student extends Person {


    public Student(String name) {
        super(name); // ruft Konstruktor der Basisklasse auf
    }

    @Override //schützt uns davor Fehler bei der Methode zu machen, damit die methode gleich bleibt
    public void getInfo() {
        super.getInfo(); // ruft implementierung der Basisklasse auf
    }

    public void learn(){
        System.out.println(name + "learns");
    }
}
