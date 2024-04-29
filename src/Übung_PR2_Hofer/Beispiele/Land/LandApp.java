package Übung_PR2_Hofer.Beispiele.Land;

public class LandApp {
    public static void main(String[] args) {
        // Erstellen eines Bundesstaates und Hinzufügen der Bundesländer
        Bundesstaat deutschland = new Bundesstaat();
        Bundesland bayern = new Bundesland(25641.52);
        Bundesland nrw  = new Bundesland(54354.44);

        deutschland.addLand(bayern);
        deutschland.addLand(nrw);

        // Ausgabe des Bruttosozialprodukts des Bundesstaates
        System.out.println("Bruttosozialprodukt von Deutschland: " + deutschland.getBiP());
    }


}

