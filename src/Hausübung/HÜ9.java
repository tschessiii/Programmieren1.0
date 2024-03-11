package Hausübung;

import java.util.Scanner;

public class HÜ9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Eingabe Aufforderung
        System.out.println("Geben Sie eine Zahl durch die sie teilen wollen:");
        int x = scanner.nextInt();

        //Ungültige Eingabe
        if (x == 0) {
            System.out.println("Ungültige Eingabe, zahl darf nicht null sein!");
            return;
        }

        //Ausgabe
        System.out.println("Die Zahlen von 1 bis 100 die durch " +x+ " teilbar sind: ");
        int nummer= 1;
        while (nummer<=100){
            if (nummer % x == 0){
                System.out.print(nummer + " ");
            }
            nummer++;
        }
        scanner.close();
    }


}
