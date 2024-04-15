package Übungen_PR2_Jandl.Konstanten;

import java.util.Scanner;

public class Calculator_Test {
    public static void main (String[] args){

        //Erstellen des Scanners zum einlesen des Altes
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie hier ihr alter ein: ");
        int alter = scanner.nextInt();

        //Erstellen der Person1 für die neue Klasse
        AgeCalculator p1 = new AgeCalculator();

        //Ausgabe der Methoden aus der anderen Klasse
        System.out.println("Dein Alter in Tagen: "+p1.ageInDay(alter));
        System.out.println("Dein Alter in Monaten: "+p1.ageInMonths(alter));
        System.out.println("Dein Alter in Wochen: "+p1.ageInWeeks(alter));
    }
}
