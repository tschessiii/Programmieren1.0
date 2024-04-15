package Übungen_PR2_Jandl.Generics.Fruits;

public class Fruit {
    private Color color;
    private String name;
    private double wight;


    public Fruit(Color color, String name, double wight) {
        this.color = color;
        this.name = name;
        this.wight = wight;
    }


    @Override
    public String toString() {
        return "Fruit{" +
                "color=" + color +
                ", name='" + name + '\'' +
                ", wight=" + wight +
                '}';
    }
}
