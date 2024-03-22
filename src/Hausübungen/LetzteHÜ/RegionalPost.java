package Hausübungen.LetzteHÜ;

public class RegionalPost {
    public static void main(String[] args) {
        FilialPost filialPost = new FilialPost(3);

        //Pakete hinzufügen
        filialPost.paketeHinzufügen(new Paket(1, "Körblergasse 12"));
        filialPost.paketeHinzufügen(new Paket(2, "Ananasgasse 14"));
        filialPost.paketeHinzufügen(new Paket(3, "Kirschstraße 16"));

        //Pakete entfernen
        filialPost.paketEntfernen(2);

        //pakete ausgeben
        System.out.println(filialPost);

    }
}
