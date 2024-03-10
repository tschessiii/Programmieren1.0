package Hausübung2;

import java.util.Scanner;

public class HÜ2_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Eingabe
        System.out.printf("Bitte geben Sie hier die Anzahl Ihrer Noten ein:");
        int anzahl = scanner.nextInt();


        //Erstellen des Arrays
        int[] noten = new int[anzahl];

        //Eingabe der Noten
        for (int i = 0; i < anzahl; i++){// Noten werden nach Anzahl eingegeben und i muss kleiner als die Anzahl sein
            System.out.println("Geben Sie hier ihre Note "+(i+1)+" ein:");// User wird gebeten immer eine Note nach der anderen einzugeben
            noten[i] = scanner.nextInt();
        }

        //Berechnung des Durchschnitts
        double durchschnitt = rechner(noten);

        //Ausgabe
        System.out.println("Der Notendurchschnitt beträgt: "+durchschnitt);
    }

    public static double rechner(int[] noten){
        int sum = 0;
        for (int note : noten){
            sum= sum+note;
        }
        return (double) sum/noten.length;
    }
}
