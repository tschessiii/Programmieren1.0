package Klausur_PR1.Übung_für_KlausurPR1.Part1;

import java.util.Scanner;

public class Übung3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie hier ihren Kontostand ein:");
        double kontostand = scanner.nextDouble();

        int option;

        do{
            System.out.println("1. Einzahlung");
            System.out.println("2. Auszahlung");
            System.out.println("3. Kontostand anzeigen");
            System.out.println("4. Exit");
            System.out.print("Bitte wählen Sie eine Option: ");
            option = scanner.nextInt();

            switch(option){
                case 1:
                    System.out.println("Geben Sie die Summe an die Sie einzahlen möchten:");
                    double einzahlung = scanner.nextDouble();
                    kontostand = kontostand+einzahlung;
                    break;

                case 2:
                    System.out.println("Geben Sie die Summe ein die Sie abheben möchten:");
                    double auszahlung = scanner.nextDouble();
                    if (auszahlung > kontostand) {
                        System.out.println("Fehler: Nicht genügend Geld auf dem Konto.");
                    } else {
                        kontostand -= auszahlung;
                        System.out.println("Auszahlung erfolgreich durchgeführt.");
                    }
                case 3:
                    System.out.println("Ihr Kontostand beträgt:"+kontostand);
                    break;

                case 4:
                    System.out.println("Programm wird beendet!");
                    break;

                default:
                    System.out.println("Ungültige Option. Bitte wählen Sie erneut.");
            }

        }while (option !=4);
        scanner.close();




    }
}
