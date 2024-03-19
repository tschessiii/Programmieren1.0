package Übungen_PR1;

import java.util.Scanner;

public class Kilometer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen zum Entfernungsrechner!");
        System.out.println("Bitte wählen Sie die Einheit, die Sie konvertieren möchten:");
        System.out.println("1. Übungen.Kilometer zu Meilen");
        System.out.println("2. Meilen zu Übungen.Kilometer");
        int choice = scanner.nextInt();
        double result;

        if (choice == 1) {
            System.out.println("Bitte geben Sie die Anzahl der Übungen.Kilometer ein:");
            double kilometers = scanner.nextDouble();
            result = kilometersToMiles(kilometers);
            System.out.println(kilometers + " Übungen.Kilometer entsprechen " + result + " Meilen.");

        } else if (choice == 2) {
            System.out.println("Bitte geben Sie die Anzahl der Meilen ein:");
            double miles = scanner.nextDouble();
            result = milesToKilometers(miles);
            System.out.println(miles + " Meilen entsprechen " + result + " Übungen.Kilometer.");

        } else {
            System.out.println("Ungültige Auswahl. Bitte wählen Sie 1 oder 2.");
        }

        scanner.close();
    }

    // Methode zur Umwandlung von Kilometern in Meilen
    public static double kilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    // Methode zur Umwandlung von Meilen in Übungen.Kilometer
    public static double milesToKilometers(double miles) {

        return miles * 1.60934;
    }

}
