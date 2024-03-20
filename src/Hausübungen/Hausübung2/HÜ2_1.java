package Hausübungen.Hausübung2;

public class HÜ2_1 {
    public static void main(String[] args){
        int[] array = {5,10,15,25,30,35};
        double durchschnitt = rechne(array);
        System.out.println("Der Durchschnitt beträgt: "+durchschnitt);
    }
    public static double rechne(int[] array){
        int sum = 0;
        for (int num : array){//Jedes Element des Übungen_PR1.AllgemeineÜbungen.Arrays wir der Variable num zugewiesen
            sum=sum+num;
        }
        return(double) sum/array.length;// sum ist die Summe aller Elemente im Array //array.lenght ist die Anzahl alle Elemente im Array
        //Wir brechenen die Summe aller Elemente durch die Anzahl aller elemente, so erhalten wir den Durschnitt
    }
}
