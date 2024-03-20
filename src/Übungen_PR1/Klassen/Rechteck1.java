package Übungen_PR1.Klassen;

public class Rechteck1 {

    public int a;
    public int b;

    public Rechteck1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double Umfang() {
        return 2 * a + 2 * b;
    }

    public double Area() {
        return a * b;
    }

    public double Dia() {
        return Math.sqrt(a * a + b * b);
    }

    @Override
    public String toString() {
        return "Der Umfang beträgt:"+Umfang()+"\nDie Fläche Fläche:"+Area()+"\nDie Diagonale beträgt:"+Dia();
    }
}
