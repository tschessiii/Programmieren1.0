import java.util.Scanner;

public class GroßerWert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie hier die erste Zahl ein:");
        double a = scanner.nextDouble();

        System.out.println("Gebern Sie hier die zweite Zahl ein:");
        double b = scanner.nextDouble();

        System.out.println("Geben Sie hier die dritte Zahl ein:");
        double c = scanner.nextDouble();

        double max = findeMax(a, b, c);

        System.out.println("Der größte Wert der Zahlen "+a+" und "+b+" und "+c+" ist gleich: "+max);

        scanner.close();

    }

    public static double findeMax(double a, double b, double c) {
        double max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}


