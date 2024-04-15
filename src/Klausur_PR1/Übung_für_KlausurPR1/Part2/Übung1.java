package Klausur_PR1.Übung_für_KlausurPR1.Part2;

public class Übung1 {

    public static void main(String[] args) {
        //Deklarieren der und initiallisieren der Variablen

        int a =0;
        int b = 1;

        for (int i = 0; i < 20; i++){
            System.out.println( a + " ");//Aktuelle Zahl wird hier ausgegebn

            int c = a+b;//Die summe von a und b wir in c gespeichert

            a = b;// a nimmt den wert b an

            b= c;// b übernimmt den wert c
        }

    }

}
