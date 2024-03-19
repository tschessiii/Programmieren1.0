package Hausübung;

import java.util.Scanner;

public class HÜ4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Aufforderung das Gwicht einzugeben:
        System.out.println("Geben Sie ihr Gewicht in kg ein (Bsp. 100):");
        double gewicht = scanner.nextInt();

        //Aufforderung die Größe in m einzugeben:
        System.out.println("Geben Sie ihre Größe in m ein (Bsp. 1,80):");
        double groesse = scanner.nextDouble();

        //Variable bmi initailisieren
        double bmi = rechnung(gewicht,groesse);

        //Methode im Übungen.Wrapper_Klassen.Main auffrufen
        ausgabe(bmi);

        //Scanner schließen
        scanner.close();

    }



    //Methode zur Berechnung des BMIs
    public static double rechnung(double gewicht, double groesse ){

        return gewicht / (groesse * groesse);
    }

    //Methode zur ausgabe des Errechneten BMIs
    public static void ausgabe(double bmi){
        System.out.println("Ihr BMI beträgt: "+bmi);

        //Wenn BMI kleiner als 18,5: Ausgabe
        //Sont wenn BMI kleiner als 25: Ausgabe
        //Sonst wenn BMI kleiner als 30: Ausgabe
        //Sonst: Ausgabe
        if (bmi<18.5){
            System.out.println("Sie sind untergewichtig.");
        } else if (bmi < 25 ) {
            System.out.println("Sie haben normales Gewicht");
        }else if (bmi < 30){
            System.out.println("Sie haben Übergewicht.");
        }else{
            System.out.println("Sie haben starke Adipositas.");
        }

    }
}
