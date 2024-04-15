package Übungen_PR1_Gerzic.AllgemeineÜbungen;

public class Rechteck {
    public static void main(String[] args) {
        // Deklaration der Variablen für die Seitenlängen eines Rechtecks
        int laenge = 5; // Länge des Rechtecks
        int width = 3;  // Breite des Rechtecks

        // Berechnung des Umfangs
        int umfang = 2 * (laenge + width);

        // Berechnung der Fläche
        int flaeche = laenge * width;

        // Ausgabe der Werte auf der Konsole
        System.out.println("Länge des Rechtecks: " + laenge);
        System.out.println("Breite des Rechtecks: " + width);
        System.out.println("Umfang des Rechtecks: " + umfang);
        System.out.println("Fläche des Rechtecks: " + flaeche);
    }
}
