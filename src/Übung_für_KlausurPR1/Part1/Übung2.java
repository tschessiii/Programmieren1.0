package Übung_für_KlausurPR1.Part1;

import java.util.Scanner;

public class Übung2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zahl = 0;



        while (zahl <1 || zahl >= 10){
            System.out.println("Bitte geben Sie eine zahl zwischen 1 und 10 ein:");
            zahl = scanner.nextInt();

            if (zahl <1 || zahl >= 10){
                System.out.println("Ungültige Zahl eingegeben. Bitte geben Sie eine Zahl bitte geben Sie eine zahl zwischen 1 und 10 ein!");
            }
        }

        String word = "";
        switch (zahl){

            case 1:
                word = "one";
                break;

            case 2:
                word = "two";
                break;

            case 3:
                word ="three";
                break;

            case 4:
                word ="four";
                break;

            case 5:
                word ="five";
                break;

            case 6:
                word ="six";
                break;

            case 7:
                word ="seven";
                break;

            case 8:
                word ="eight";
                break;

            case 9:
                word ="nine";
                break;

            case 10:
                word = "ten";
                break;
        }
        System.out.println("Das Englische Wort für die Zahl "+zahl+" ist "+word+"!");









    }
}
