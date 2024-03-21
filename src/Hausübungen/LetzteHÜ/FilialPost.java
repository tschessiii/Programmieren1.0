package Hausübungen.LetzteHÜ;

public class FilialPost {

    private Paket[] pakete;
    private int anzahlPakete;

    public void FilialPost(int maxAnzahlPakete) {
        pakete = new Paket[maxAnzahlPakete];
    }
}
