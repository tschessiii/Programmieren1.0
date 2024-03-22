package Übungs_Klausur.MusicAlbum;


public class MusicApp {
    public static void main(String[] args) {
        Album album = new Album(5,180,300);

        //Test der ersten Methode
        System.out.println("Durschnittliche Songlänge beträgt: "+album.averageSongLength());

        //Testen der zweiten Methode
        System.out.println("Die totale Songlänge beträgt: "+album.totalLength());

        //Testen der dritten Methode
        System.out.println("Passte es aufs Medium mit 200 minuten: "+album.fitsOnMedium(200));
    }
}
