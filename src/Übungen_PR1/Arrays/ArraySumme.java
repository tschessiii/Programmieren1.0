package Übungen_PR1.Arrays;

public class ArraySumme {
    public static void main(String[] arsg){
        int[] zahlen = {1,2,3,4,5,6}; //Übungen_PR1.AllgemeineÜbungen.Arrays.Array auffüllen
        System.out.println("Die Summe der zahlen beträgt "+summe(zahlen)+ "!");//Ausgeben
    }

    //Methode um die Summe zu erstellen
    public static int summe(int[] numbers){
        int summe = 0;//Variable summe auf 0 setzten
        for(int i :numbers){ //Variable I geht durch alle elemente von numbers (For-Each Schleife)
            summe = summe +i;//Die Summe wird + i gesetzt
        }
        return summe;//wir returnen zurück zur main

        /*
        In einer nornalen Vorschleife:
        for(int i =0; i < numbers.lenght; i++){
        sum=sum+ numbers[i]
        }*/

        /*
        In einer While Schleife:
        int j=0;
        while (j<numbers.lenght;i++){
        sum = sum+numbers[j];
        }*/
    }
}
