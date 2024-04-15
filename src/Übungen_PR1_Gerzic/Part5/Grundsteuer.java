package Übungen_PR1_Gerzic.Part5;

public class Grundsteuer {


//Erstellen der Methode grundSteuerberechnen in der wir ein zweidimensionales Array initialisieren:
    public double grundSteuerberechnen(int arr[][]){
        double sum = 0;


        //For Schleife um immer wieder durchzugehen
        for (int i = 0; i < arr.length; i++) {
            int typ = arr[i][0];

            //Switch um die Summe der verschiedenen Typen zu berechnen
            switch (typ){
                case 1:
                    sum = sum+ (3.20*arr[i][1]*arr[i][2]);
                    break;

                case 2:
                    sum= sum+ (2.10*arr[i][1]*arr[i][2]);

                    break;

                case 3:
                    sum = sum+ (0.90*arr[i][1]*arr[i][2]);

                    break;

            }

        }
        //Wir geben die Summe in die Übungen.Übungen_PR2.Wrapper_Klassen.Main zurück
       return sum;

    }

}
