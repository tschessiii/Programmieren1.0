package Übung_PR2_Hofer.Beispiele.Figures;

public class Rectangle implements Figure {
    protected double lenght;
    protected double width;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        double u=2*lenght +2*width;
        return u;
    }

    @Override
    public double getArea() {
        double f=width*lenght;
        return f;
    }
}

