package Tamagochi;

import java.util.Scanner;
public class Tamagochi_Test {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        System.out.println("Geben Sie ihre X Koordinate ein:");
        System.out.println("Geben Sie ihre Y Koordinate ein:");
        System.out.println("Geben Sie ihren Futterstand ein:");
        Tamagochi pet = new Tamagochi(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(pet.toString());

        pet.bewegen();
        System.out.println(pet.toString());

        do {
           pet.bewegen();
            System.out.println(pet.toString());
        }while (pet.getX() !=0 && pet.getY() !=0);
        System.out.println("Sie haben ihr Ziel erreicht!");

    }
}
