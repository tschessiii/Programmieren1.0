package Übungen_PR1_Gerzic.Tamagochi;

import java.util.Scanner;
public class Tamagochi_Test {
    public static void main(String[] args){

        //Eingabe der Kooridinaten
        Scanner scanner= new Scanner(System.in);
        System.out.println("Geben Sie ihre X Koordinate ein:");
        System.out.println("Geben Sie ihre Y Koordinate ein:");
        System.out.println("Geben Sie ihren Futterstand ein:");
        Tamagochi pet = new Tamagochi(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(pet.toString());

        //Pet bewegen, falls der Futterstand 0 ist
        pet.bewegen();
        System.out.println(pet.toString());

        //So lange bewegen bis x und y = 0 sind
        do {
           pet.bewegen();
            System.out.println(pet.toString());
        }while (pet.getX() !=0 || pet.getY() !=0);
        System.out.println("Sie haben ihr Ziel erreicht!");

    }
}
