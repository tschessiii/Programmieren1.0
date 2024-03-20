package Übungen_PR1.AllgemeineÜbungen;

import java.util.Scanner;

public class Passwort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pw;


        do {
            System.out.println("Geben Sie ihr Übungen.Passwort ein:");
            pw = scanner.next();

        } while (!pw.equals("geheim"));

        System.out.println("Übungen.Passwort korrekt!");

    }

}
