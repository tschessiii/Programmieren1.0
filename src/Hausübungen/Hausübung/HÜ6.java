package Hausübungen.Hausübung;

import java.util.Scanner;

public class HÜ6 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        System.out.println("Willkommen zum Temperatur umrechner!");
        System.out.println("Wählen sie zwischen Option 1 und 2");
        System.out.println("1. Celsius zu Fahrenheit");
        System.out.println("2. Fahrenheit zu Celsius");
        int auswahl = scanner.nextInt();
        double result;

        if (auswahl == 1){
            System.out.println("Bitte geben Sie die Zahl in Celsius ein:");
            double celsius = scanner.nextDouble();
            result = cing(celsius);
            System.out.println(celsius+" betragen "+result+ " Fahrenheit");
        }
        if (auswahl == 2){
            System.out.println("Bitte geben Sie hier die Zahl in Fahrenheit ein: ");
            double far = scanner.nextDouble();
            result = ginc(far);
            System.out.println(far+" betragen "+result+ " Celsius");
        }
    }

    public static double cing(double celsius){
        return (celsius * 1.8) +32;
    }

    public static double ginc(double far){
        return (far -32) * (5)/(9);

    }
}
