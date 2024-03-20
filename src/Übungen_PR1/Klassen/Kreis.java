package Übungen_PR1.Klassen;

public class Kreis {

    public int radius;

    //Constructor mit dem wir neue Kreise erstellen
    public Kreis(int radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI *radius*radius;
    }


    @Override
    public String toString() {
        return "Radius: "+radius+", Fläche: "+getArea();
    }
}
