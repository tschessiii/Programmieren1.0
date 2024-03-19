package Hausübung;

import java.util.Scanner;

public class HÜ5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Auffordern Zahl eingeben
        System.out.println("Geben Sie hier eine Zahl ein:");
        int num1 = scanner.nextInt();

        //Auffordern zweite Zahl eingeben
        System.out.println("Geben Sie hier die zweite Zahl ein:");
        int num2 = scanner.nextInt();

        //Addieren
        int sum = add(num1, num2);
        System.out.println("Summe von " + num1 + " und " + num2 + " beträgt: " + sum);

        //Minimum
        int minimum = min(num1, num2);
        System.out.println("Das minimum der Übungen.Zahlen " + num1 + " und " + num2 + " beträgt: " + minimum);

        //Maximum
        int maximum = max(num1, num2);
        System.out.println("Das maximum der Übungen.Zahlen " + num1 + " und " + num2 + " beträgt: " + maximum);

        //Absolut
        int absolut = abs(num2);
        System.out.println("Der Absolute Wert der Zahl " + num2 + " beträgt " + absolut);
    }

    //Methode zum addieren der zwei Übungen.Zahlen
    public static int add(int a, int b) {

        return a + b;
    }

    //Berechnen des Minimums
    public static int min(int a, int b) {

        return Math.min(a, b);
    }

    //Berechnen des Maximums
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    //Berechnen der Absoluten Zahl
    public static int abs(int a) {

        return Math.abs(a);
    }
}
