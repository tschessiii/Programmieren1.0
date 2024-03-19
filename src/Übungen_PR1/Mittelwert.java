package Übungen_PR1;

import java.util.Scanner;

public class Mittelwert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie die erste Zahl ein:");
        double num1 = scanner.nextDouble();

        System.out.println("Bitte geben Sie die zweite Zahl ein:");
        double num2 = scanner.nextDouble();

        double durchschnitt = Mittelwert(num1, num2);

        System.out.println("Der Übungen.Mittelwert von " + num1 + " und " + num2 + " ist: " + durchschnitt);

        scanner.close();
    }

    // Methode zur Berechnung des Mittelwerts von zwei Übungen.Zahlen
    public static double Mittelwert(double num1, double num2) {

        return (num1 + num2) / 2;
    }
}
