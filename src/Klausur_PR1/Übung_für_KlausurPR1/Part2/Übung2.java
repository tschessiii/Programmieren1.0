package Klausur_PR1.Übung_für_KlausurPR1.Part2;

import java.util.Scanner;

public class Übung2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie eine ganze positive Zahl ein: ");
         int eingabe = scanner.nextInt();

         for (int i = 0; i <= eingabe; i++){

             if (i % 2 !=0 ){
                 System.out.println(i+ " ");
             }
         }

    }
}
