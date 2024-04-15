package Klausur_PR1.Übung_für_KlausurPR1.Part1;

import java.util.Scanner;

public class Übung1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie hier ihren Namen ein:");
        String name = scanner.next();

        System.out.println("Bitte geben Sie hier ihr Alter ein:");
        int alter = scanner.nextInt();

        System.out.println("Hallo, "+name+"! Du bist "+alter+" Jahre alt!");

    }
}
