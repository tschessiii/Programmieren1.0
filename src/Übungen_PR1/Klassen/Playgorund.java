package Übungen_PR1.Klassen;

public class Playgorund {//für Übungen_PR1.AllgemeineÜbungen.Klassen
    public static void main(String[] args) {

       Player p1 = new Player("Sam",6);

       p1.neuerOrt("Graz");
       p1.gewonnen(6);

       Spielerverwaltung spielerverwaltung = new Spielerverwaltung();
       spielerverwaltung.neuerSpieler(p1);

    }
}
