package Klausur_PR1.Übung_für_KlausurPR1.Part3;

public class Übung1 {
    public static void main(String[] args) {
        //Manuell ein Array mit 10 Ganzzahlen also int erzeugen
        int[] zahlen = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        //Das Array Element fuer Element ausgeben
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }

        System.out.println("-------------------------------------------------------------------------------------------");
        //Manuell ein Array mit 5 Gleitkommazahlen also double erzeugen
        double [] gleitkomm = {2.5,2.6,6.2,7.4,8.4};
        double max = gleitkomm[0];

        //Schleife erstellen die mir das größte Element im Array ausgibt
        for (int i =0; i<gleitkomm.length; i++){
            if(gleitkomm[i] > max){
                max= gleitkomm[i];//Ich übergebe dem double max den wer des Arrays an der stelle i
            }

        }

        System.out.println("Das größte Element in Array ist: "+max);



        System.out.println("-------------------------------------------------------------------------------------------");
        String[] string = {"Ananas","Birne","Banane","Apfel","Uranus","Neptun","Mars","Erde"};

        for (int i = 0;i < string.length;i++){
            System.out.println("Das Wort: "+string[i]+ " hat die Länge: "+string[i].length());
        }

        System.out.println("-------------------------------------------------------------------------------------------");

        //Manuell befüllen
        int[] add ={1,2,3,4,5,6,7,8,9,10,11,12};
        int sum = 0;

        for (int i = 0;i<add.length; i++){
            sum = sum+add[i];
        }
        System.out.println("Die Summe aller Elemente im Array beträgt: "+sum);









    }
}
