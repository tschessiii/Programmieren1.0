package Hausübungen.LetzteHÜ;

import java.util.ArrayList;
import java.util.Arrays;

public class FilialPost {

    private Paket[] pakete;
    private int anzahlPakete;
    private int maxAnzahlPakete;


    //Constructor erstellen
    public FilialPost(int maxAnzahlPakete) {
        this.pakete = new Paket[maxAnzahlPakete];
        this.anzahlPakete = 0;// nicht notwendig, trotzdem da
        this.maxAnzahlPakete = maxAnzahlPakete;
    }

    //Methode zum Pakete hinzufügen
    public void paketeHinzufügen(Paket paket) {
        if (anzahlPakete < maxAnzahlPakete) {//Wenn die Anzahl an Paketen kleiner als die max. Anzahl an Paketen ist:
            pakete[anzahlPakete] = paket;//das Objekt paket wird dem Array pakete hinzugefügt
            anzahlPakete++;// die anzahl der Pakete wird um 1 erhöht
        } else {
            System.out.println("Maximale Anzahl an Paketen erreicht!");//Sonst soll das ausgegeben werden
        }
    }

    //Methode zum Pakete entfernen
    public void paketEntfernen(int paketID) {
        boolean found = false;//Wir erstellen eine Variable found und setzten sie auf false
        for (int i = 0; i < anzahlPakete; i++) {//iteiert durch das Array pakete, das alle Pakete enthält die von der Filale verwaltet werden
            if (pakete[i].getId() == paketID) {//Innerhalb der Schleife wird überprüft, ob die ID des Pakets an der aktuellen Position i im Array mit der angegebenen paketID übereinstimmt
                pakete[i] = null;//Wenn das gesucht Paket gefunden wird, wird es gleich null entfernt
                found = true;//Setzt die Anzeige auf True, da das gesuchte Paket gefunden wurde
                anzahlPakete --;
                maxAnzahlPakete --;
                break;
            }
        }
    }


    @Override
    public String toString() {
        return "FilialPost Details:\n" +//n beinhaltet einen Zeilenumbruch
                "Anzahl der Pakete: " + anzahlPakete + "\n" +
                "Maximale Anzahl der Pakete: " + maxAnzahlPakete + "\n" +
                "Pakete:\n" +
                Arrays.toString(pakete);
    }
}


