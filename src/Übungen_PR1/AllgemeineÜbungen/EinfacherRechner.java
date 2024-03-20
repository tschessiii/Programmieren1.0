package Übungen_PR1.AllgemeineÜbungen;

import java.util.Scanner;

public class EinfacherRechner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Benutzer auffordern Operand1 eingeben
        System.out.println("Bitte geben Sie hier ihren ersten Operanden ein:");
        int zahl1 = scanner.nextInt();

        //Benutzer auffordern Operand2 eingeben
        System.out.println("Bitte geben Sie hier ihren zweiten Operanden ein:");
        int zahl2 = scanner.nextInt();

        //Benutzer auffordern Operation eingeben
        System.out.println("Bitte geben Sie hier ihre Operation ein (+,-,*,/)");
        char op = scanner.next().charAt(0);

        //Ergebnis durchführen
        double ergebnis = 0;
        boolean fehler = false;

        //Switch erstellen für Operation
        switch (op) {
            case '+':
                ergebnis = zahl1 + zahl2;
                break;
            case '-':
                ergebnis = zahl1 - zahl2;
                break;
            case '*':
                ergebnis = zahl1 * zahl2;
                break;
            case '/':
                if (zahl2 != 0) {
                    ergebnis = zahl1 / zahl2;
                } else {
                    System.out.println("Fehler: Division durch 0 nicht möglich.");
                    fehler = true;
                }
                break;
            default:
                System.out.println("Ungültige Operation!");
                fehler = true;

        }
        //Ausgabe wenn nicht der Fehler kommt
        if (!fehler){
            System.out.println("Das Ergebnis lautet:"+ergebnis);
            scanner.close();
        }
        scanner.close();
    }
}
