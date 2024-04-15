package Übungen_PR1_Gerzic.AllgemeineÜbungen;

import java.util.Scanner;

public class Uebung5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Handelt es sich um eine A380? true oder false: ");
        boolean A380 = scanner.nextBoolean();

        for (int i = 1; i <= 50; i++) {
            if (i == 13 || i == 17) {
                continue;
            }

            System.out.println("Reihe: " + i);

            if (A380 == true && i == 19) {
                break;
            }

        }


    }
}