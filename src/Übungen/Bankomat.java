package Übungen;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kontostand;

        // Benutzer auffordern, den Kontostand einzugeben
        System.out.println("Bitte geben Sie Ihren Kontostand ein:");
        kontostand = scanner.nextDouble();

        int option;
        do {
            // Menü anzeigen
            System.out.println("\nÜbungen.Bankomat Menü:");
            System.out.println("1. Einzahlung");
            System.out.println("2. Auszahlung");
            System.out.println("3. Kontostand anzeigen");
            System.out.println("4. Exit");
            System.out.print("Bitte wählen Sie eine Option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Einzahlung durchführen
                    System.out.print("Bitte geben Sie den Einzahlungsbetrag ein: ");
                    double einzahlung = scanner.nextDouble();
                    kontostand += einzahlung;
                    System.out.println("Einzahlung erfolgreich durchgeführt.");
                    break;
                case 2:
                    // Auszahlung durchführen
                    System.out.print("Bitte geben Sie den Auszahlungsbetrag ein: ");
                    double auszahlung = scanner.nextDouble();
                    if (auszahlung > kontostand) {
                        System.out.println("Fehler: Nicht genügend Geld auf dem Konto.");
                    } else {
                        kontostand -= auszahlung;
                        System.out.println("Auszahlung erfolgreich durchgeführt.");
                    }
                    break;
                case 3:
                    // Kontostand anzeigen
                    System.out.println("Aktueller Kontostand: " + kontostand);
                    break;
                case 4:
                    // Programm beenden
                    System.out.println("Programm wird beendet.");
                    break;
                default:
                    System.out.println("Ungültige Option. Bitte wählen Sie erneut.");
            }
        } while (option != 4);

        scanner.close();
    }

}

