package Hausübung2;

public class Messung {
    public double[][] messung;
    public int woche;

    public Messung(double[][] messung, int woche) {
        this.messung = new double[7][3];
        this.woche = woche;

        //Initalisieren des Arrays mit den Standart Werten 0.0
        for (int i = 0; i<7;i++){
            for(int j=0;j<3;j++){
                this.messung[i][j]=0.0;
            }
        }
    }




    public int Tageszahl(String tag){
        switch (tag.toLowerCase()){
            case "Montag":
                return 0 ;

            case "Dienstag":
                return 1;

            case "Mittwoch":
                return 2;

            case "Donnerstag":
                return 3;

            case "Freitag":
                return 4;

            case "Samstag":
                return 5;

            case "Sonntag":
                return 6;

            default:
                return -1;//ungültiger Tag
        }
    }


    public void messungAmTag(String tag,double messwert){
        int tageszahl = Tageszahl(tag);
        if(tageszahl != -1){//gültiger Tag (Wenn tageszahl nicht gleich -1 ist, ist es ein gültiger Tag
            for(int i = 0; i<3; i++){
                if(messung[tageszahl][i] == 0.0){//Freier Slot
                    messung[tageszahl][i]= messwert;
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
