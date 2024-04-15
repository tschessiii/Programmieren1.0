package Übungen_PR1_Gerzic.Rekursion;

public class MainCoutdown {


    public static void countdown(int zaehler){
        //Wir checken ob der zähler schon O ist
        if(zaehler==0){
            return;
        }

        //Ausgabe des Countdowns
        System.out.println("Der Countdown läuft noch t-"+zaehler+" Sekunden!");

        //Zähler - 1 damit er auch runter zählt
        zaehler--;

        //Erwähnen der Methode in der Methode damit es eine Schleife wird
        countdown(zaehler);
    }

    public static void main(String[] args) {

        //Erwähnen der Methode in der Main
        countdown(10);
    }
}
