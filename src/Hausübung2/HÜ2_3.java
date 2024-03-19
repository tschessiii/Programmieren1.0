package Hausübung2;

import java.util.Scanner;

public class HÜ2_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        //Eingabe Aufforderung
        System.out.println("Bitte geben Sie die Anzahl der Wörter ein:");
        int n = scanner.nextInt();
        scanner.nextLine();

        //Array erstellen
        String[] wort = new String[n];

        // Wörter einlesen
        for (int i = 0; i< n;i++){
            System.out.println("Geben Sie das "+(i+1)+" Wort ein:");
            wort[i] = scanner.next();
        }

        //Eine weitere Zahl k eingeben
        System.out.println("Bitte geben Sie eine weitere Zahl ein(>0):");
        int k = scanner.nextInt();
        if (k <0){
            System.out.println("Bitte eine Zahl die größer als 0 ist!");
        }//Wenn k kleiner als null ist Error ausgeben

        //Methode in der Übungen.Wrapper_Klassen.Main erwähnen
        wort =entfernen(wort, k);

        //Ausgabe der übrigen Wörter
        System.out.println("Die übrigen Wörter sind: ");
        for (String w : wort){
            System.out.println(w);
        }
    }

    public static String[] entfernen(String[] worte, int k ){
        int count = 0;
        for(String wort : worte){
            if(wort.length() >= k){
                worte[count++] = wort;
            }
        }
        return java.util.Arrays.copyOf(worte, count);
    }
}
