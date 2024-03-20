package Übungen_PR1.AllgemeineÜbungen;

import java.util.Scanner;

public class RatenGeheimzahl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int geheim = 12;

        System.out.println("Versuchen Sie die Geheimzahl zu erraten!");

        //Eine Zahl zum Raten eingeben
        System.out.println("Bitte geben Sie hier ihren Tipp der ganzen Zahl ein:");
        int zahl = scanner.nextInt();

        //Eingegebene Zahl mit der Geheimzahl vergleichen
        if (zahl == geheim) {
            System.out.println("Toll gemacht, du hast es erraten!");
        } else if (zahl < geheim) {
            if (geheim - zahl == 3) {
                System.out.println("Knapp daneben! Jedoch ist die Angegeben Zahl ist zu klein.");
            } else {
                System.out.println("Die Angegebene Zahl ist zu klein.");
            }
        } else {
            if (zahl - geheim == 3) {
                System.out.println("Knapp daneben! Jeoch ist die Angegebene Zahl zu groß.");
            } else {
                System.out.println("Die Angegebene Zahl ist zu groß.");
            }
        }
        //Scanner schließen
        scanner.close();
    }
}
