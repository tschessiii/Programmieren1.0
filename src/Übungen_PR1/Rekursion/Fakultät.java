package Übungen_PR1.Rekursion;

public class Fakultät {

    public static void main(String[] args) {
        int zahl = 5; // Die gegebene Zahl
        int ergebnis = fakultät(zahl); // Fakultät berechnen
        System.out.println("Ergebnis: " + ergebnis); // Ausgabe des Ergebnisses
    }

    // Rekursive Methode zur Berechnung der Fakultät
    public static int fakultät(int n) {
        if (n == 0 || n == 1) { // Basisfall: Fakultät von 0 oder 1 ist 1
            return 1;
        } else {
            return n * fakultät(n - 1); // Rekursiver Aufruf mit n-1
        }
    }
}
