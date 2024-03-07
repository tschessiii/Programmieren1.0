package Hausübung;

import java.util.Scanner;

public class HÜ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Eingabe Temperatur
        System.out.println("Wie viel Grad hat es? (zwischen -20° und 35°)");
        int grad = scanner.nextInt();

        //Wenn Grad kleiner als -20 oder größer als 35: Ungültig
        if (grad < -20 || grad > 35) {
            System.out.println("Ungültige Grad Werte, geben Sie eine Temperatur zwischen -20° und 35° ein.");
            return;
        }

        //Eingabe Wetter
        System.out.println("Wie ist das Wetter? (sonnig, bewölkt, regen");
        String wetter = scanner.next().toLowerCase();

        //Wenn Wetter ungleich sonnig, bewölkt und regen: Ausgabe = Vertippt?
        if (!wetter.equals("sonnig") && !wetter.equals("bewölkt") && !wetter.equals("regen")){
            System.out.println("Hast du dich vielleicht Vertippt?");
        }

        //Switch um Wetter zu bestimmen:
        switch (wetter) {
            case "sonnig":
                if (grad >= 25) {
                    System.out.println("Es ist sonnig und warm, lust auf einen Besuch am Badesee?");
                } else {
                    System.out.println("Es ist sonnig aber nicht warm, vielleicht ein Picknick machen?");
                }
                break;
            case "bewölkt":
                System.out.println("Das Wetter ist bewölkt, ein guter Tag für einen Spaziergang oder eine Wanderung im Wald.");
                break;
            case "regen":
                System.out.println("Es regnet, wie wäre es mit einem Spieleabend mit der Familie oder Freunden.");
                break;

        }
    }

}
