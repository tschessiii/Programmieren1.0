package Klausur_PR1.Übung_für_KlausurPR1.Part1;

import java.util.Scanner;

public class Übung4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie hier bitte eine Zeichenfolge ein: ");
        int option;

        do{
            System.out.println("1. Umgekehrte String ausgabe");
            System.out.println("2. Gerade oder Ungerade?");
            System.out.println("3. Vokale zählen");
            System.out.println("4. Fakultät berechnen");
            System.out.println("5. Exit");
            System.out.print("Bitte wählen Sie eine Option: ");
            option = scanner.nextInt();



            switch (option){

                case 1:
                    umkehren();
                    break;

                case 2:
                    gerodunger();
                    break;

                case 3:
                    vokale();
                    break;

                case 4:
                    rechnefakultät();
                    break;

                case 5:
                    System.out.println("Programm wird beendet!");
                    break;

                default:
                    System.out.println("Ungültige Option. Bitte wählen Sie erneut.");

            }

        }while (option != 5);

    }



    public static void umkehren(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben sie ein Wort ein: ");
        String wort = scanner.nextLine();

        String reversed = "";
        for (int i = wort.length() - 1; i >= 0; i--) {
            reversed += wort.charAt(i);
        }
        System.out.println("Umgedrehtes Wort: " + reversed);
    }

    public static void gerodunger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie hier eine Zahl ein:");
        int zahl = scanner.nextInt();

        if(zahl % 2 == 0){
            System.out.println("Die Zahl "+zahl+" ist gerade!");
        }else {
            System.out.println("Die Zahl "+zahl+" ist ungerade!");
        }
    }

    public static void vokale(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie hier ein Wort ein:");
        String vokal = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < vokal.length(); i++) {
            char c = Character.toLowerCase(vokal.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        System.out.println("Nummer der Vokalen:"+count);
    }



    public static void rechnefakultät(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine positive Zahl ein: ");
        int num = scanner.nextInt();

        int factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is " + factorial);
    }

}
