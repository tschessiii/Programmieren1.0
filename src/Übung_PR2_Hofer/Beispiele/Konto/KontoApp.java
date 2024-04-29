package Übung_PR2_Hofer.Beispiele.Konto;

public class KontoApp {
    public static void main(String[] args) {
        Konto konto= new Konto("Max Mustermann");

        //Geld aufs Konto einzahlen
        konto.einzahlen(1000.74);

        System.out.println("Aktueller Kontostand beträgt: "+konto.getKontostand());

        //Geld auszahlen
        konto.auszahlen(500.32);

        System.out.println("Aktueller Kontostand beträgt: "+konto.getKontostand());

        System.out.println("_______________________________");

        //Testen der anderen Klasse /Methoden
        GiroKonto giroKonto = new GiroKonto("Anna Mustermann", 1000);

        giroKonto.einzahlen(2300);
        System.out.println("Aktueller Kontostand beträgt: "+giroKonto.getKontostand());

        giroKonto.auszahlen(2304);
        System.out.println("Aktueller Kontostand beträgt: "+giroKonto.getKontostand());

        System.out.println("_______________________________");

        //Testen der anderen Klasse/Methoden
        SparKonto sparKonto = new SparKonto("Max Mustermann");

        sparKonto.einzahlen(23321.32);
        System.out.println("Aktueller Kontostand beträgt: "+sparKonto.getKontostand());

        sparKonto.auszahlen(2131.21);
        System.out.println("Aktueller Kontostand beträgt: "+sparKonto.getKontostand());

        System.out.println("_______________________________");

        //Testen der anderen Klasse/Methoden
        JugendGiroKonto jugendGiroKonto = new JugendGiroKonto("Max Mustermann", 1000, 10000);

        jugendGiroKonto.einzahlen(10000.22);
        System.out.println("Aktueller Kontostand beträgt: "+jugendGiroKonto.getKontostand());

        jugendGiroKonto.auszahlen(123441.22);
        System.out.println("Aktueller Kontostand beträgt: "+jugendGiroKonto.getKontostand());

        System.out.println("_______________________________");

        //Casten des Jugendkontos:
        Konto konto1 = (Konto) jugendGiroKonto;

        konto1.einzahlen(1000.0);
        System.out.println("Kontostand nach Einzahlung: " + konto1.getKontostand());
        konto1.auszahlen(500.0);
        System.out.println("Kontostand nach Auszahlung: " + konto1.getKontostand());


    }
}
