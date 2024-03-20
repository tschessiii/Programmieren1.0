package Hausübungen.Hausübung2;

public class Messung {
    private double[][] messungen;
    private int woche;

    public Messung(int woche) {
        this.woche = woche;
        this.messungen = new double[7][3];

        //Initalisieren des Übungen_PR1.AllgemeineÜbungen.Arrays mit den Standart Werten 0.0
        for (int i = 0; i<7;i++){
            for(int j=0;j<3;j++){
                this.messungen[i][j]=0.0;
            }
        }
    }

    private int Tageszahl(String tag){
        switch (tag.toLowerCase()){
            case "montag":
                return 0 ;

            case "dienstag":
                return 1;

            case "mittwoch":
                return 2;

            case "donnerstag":
                return 3;

            case "freitag":
                return 4;

            case "samstag":
                return 5;

            case "sonntag":
                return 6;

            default:
                return -1;//ungültiger Tag
        }
    }


    public void messungAmTag(String tag,double messwert){
        int tageszahl = Tageszahl(tag);
        if(tageszahl != -1){//gültiger Tag (Wenn tageszahl nicht gleich -1 ist, ist es ein gültiger Tag
            for(int i = 0; i<3; i++){
                if(messungen[tageszahl][i] == 0.0){//Freier Slot
                    messungen[tageszahl][i]= messwert;
                    System.out.println("Messung am "+tag+" erfolgreich gespeichert!");
                   return;
                }
            }
            System.out.println("Kein freier Slot am "+tag+" verfügbar!");
        }else {
            System.out.println("Ungültiger Wert!");
        }

    }
}
