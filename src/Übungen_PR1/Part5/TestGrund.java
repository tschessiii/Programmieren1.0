package Übungen_PR1.Part5;

public class TestGrund {
    public static void main(String[] args){

        //Wir erstellen eine neue Übungen.Person:
        Grundsteuer f1 = new Grundsteuer();


        // Wir befüllen das zweidimensionale Array:
        int[][] grundstuecke ={
                {1,30,40},
                {2,50,60},
                {3,70,80}
        };

        //Wir geben das Ergebnis aus:
        double ergebnis = f1.grundSteuerberechnen(grundstuecke);
        System.out.println("Summe der Grundsteuer: "+ergebnis);







    }
}
