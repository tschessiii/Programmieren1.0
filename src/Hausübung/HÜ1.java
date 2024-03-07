package Hausübung;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HÜ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Auffordern den Benutzer eine Zahl einzugeben
        System.out.println("Bitte geben Sie eine Zahl ein:");
        int zahl = scanner.nextInt();

        //Wenn die Zahl gerade ist dann: Ausgabe
        //Sonst (also Zahl ungerade ): Ausgabe
        if (gerade(zahl)) {
            System.out.println(zahl + " ist gerade!");
        } else {
            System.out.println(zahl + " ist ungerade!");
        }
    }

    //Methode um die eingegeben Zahl / 2 zu rechnen um zu schauen ob diese Zahl gerade ist
    public static boolean gerade(int zahl) {
        return zahl % 2 == 0;
    }


}
