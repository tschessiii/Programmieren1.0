package Übungen_PR1_Gerzic.Tamagochi;

import java.util.Scanner;

public class Tamagochi {

    private int x;
    private int y;
    private int futterstand;

    //Konstruktor
    public Tamagochi(int x, int y, int futterstand) {
        this.x = x;
        this.y = y;
        this.futterstand = futterstand;
    }

//Bewegung
    public void bewegen() {

        Scanner scanner = new Scanner(System.in);

        if(futterstand ==0) {
            System.out.println("Wie viel wollen Sie ihrem Tier füttern?");
            int futter = scanner.nextInt();
            futter = futterstand = futter + futterstand;
        }
        System.out.println("Geben Sie eine Richung an(right,left,up,down):");
        String richtung = scanner.next();

        if (richtung.toLowerCase().equals("right")) {
            x=x+1;
            schritte();
        } else if (richtung.toLowerCase().equals("left")) {
            x=x-1;
            schritte();
        }else if (richtung.toLowerCase().equals("up")){
            y=y+1;
            schritte();
        }else if (richtung.toLowerCase().equals("down")){
            y=y-1;
            schritte();
        }else {
            System.out.println("Falscher Weg bro!");
        }
    }

    public void  schritte(){
        futterstand = futterstand-1;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Übungen_PR1.AllgemeineÜbungen.Tamagochi.Übungen_PR1.AllgemeineÜbungen.Tamagochi{" +
                "x=" + x +
                ", y=" + y +
                ", futterstand=" + futterstand +
                '}';
    }
}
