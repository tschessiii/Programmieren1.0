package Hausübungen.Hausübung;

import java.util.Scanner;

public class HÜ2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Auffordern Alter einzugeben
        System.out.println("Bitte geben Sie ihr Alter ein:");
        int alter = scanner.nextInt();

        //Reihenfolge beachten, größte immer zu erst
        //Wenn Alter größer gleich 18: Ausgabe
        //Sonst wenn alter größer gleich 16: Ausgabe
        //Sonst: Ausgabe
        if(alter >= 18){
            System.out.println("Sie sind alt genug, um eine Lenkerberechtigung für die Übungen_PR1.AllgemeineÜbungen.Klassen B und A1 zu erhalten.");
        } else if (alter >=16) {
            System.out.println("Sie sind alt genug, um eine Lenkerberechtigung für die Klasse AM zu erhalten.");
        } else{
            System.out.println("Sie sind leider noch zu Jung.");
        }
    }
}
