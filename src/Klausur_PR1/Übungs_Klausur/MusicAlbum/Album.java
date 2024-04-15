package Klausur_PR1.Übungs_Klausur.MusicAlbum;

public class Album {

    private int nrSong;
    private double shortestSong;//in Sekunde
    private double longestSong;//in Sekunden


    //Constructor
    public Album(int nrSong, double shortestSong, double longestSong) {
        this.nrSong = nrSong;
        this.shortestSong = shortestSong;
        this.longestSong = longestSong;
    }

    //Methode um die durschnittliche Songlänge zu berechnen
    public double averageSongLength(){
        double sum= 0;
        return sum = (longestSong+shortestSong)/2.0;
    }

    //Methode um die Totale Länge zu berechnen
    public double totalLength(){
        return nrSong * averageSongLength();
    }

    //Methode um zu testen ob es sich auf einem Medium ausgeht
    public boolean fitsOnMedium(int minutes){
        //Umerechnen der Minuten in Sekunden
        double min = minutes *60;

       //Überprüfen ob es auf as Alpum rauf passt
        return totalLength() <= min;
    }
}
