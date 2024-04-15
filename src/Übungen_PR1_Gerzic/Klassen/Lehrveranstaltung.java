package Übungen_PR1_Gerzic.Klassen;

import java.util.Arrays;

public class Lehrveranstaltung {

    public String bezeichnung;
    public int id;
    public int[] noten;

    public Lehrveranstaltung(String bezeichnung, int id) {
        this.bezeichnung = bezeichnung;
        this.id = id;
        noten = new int[12];
    }

    @Override
    public String toString() {
        return "Übungen_PR1.AllgemeineÜbungen.Klassen.Lehrveranstaltung{" +
                "bezeichnung='" + bezeichnung + '\'' +
                ", id=" + id +
                ", noten=" + Arrays.toString(noten) +
                '}';
    }

    public void neueNote(int note){
        for (int i=0;i < noten.length;i++){
            if(noten[i] ==0){
                noten[i]=note;
                break;
            }
        }
    }


    public int besteNote(){
        int note = noten[0];//erste Note wird geholt
        if (note !=0);
        for(int i =1; i < noten.length; i++){//
            if (noten[i] <note){
                if(noten[i] !=0){
                    note=noten[i];
                }
            }
        }
        return note;
    }
}
