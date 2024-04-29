package Übung_PR2_Hofer.Beispiele.Figures;

public class FigureApp {
    public static void main(String[] args) {
        Circle circle = new Circle(59.1);
        Rectangle rectangle = new Rectangle(40,20);
        FigureManager figureManager = new FigureManager();


        figureManager.add(circle);
        figureManager.add(rectangle);

        System.out.println("Fläche vom Kreis:"+circle.getArea());
        System.out.println("Fläche vom Rechteck:"+rectangle.getArea());

        System.out.println("____________________________________________");

        System.out.println("Umfang vom Kreis:"+circle.getPerimeter());
        System.out.println("Umfang vom Rechteck:"+rectangle.getPerimeter());



    }
}
