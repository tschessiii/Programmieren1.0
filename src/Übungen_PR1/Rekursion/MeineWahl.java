package Übungen_PR1.Rekursion;

public class MeineWahl {


    public static int berechneSumme(int[] arr, int i){

        if (i >= arr.length){
            return 0;//Wenn i ausßerhalb des Arrays liegt ist die Summe gleich 0
        }else {
            return arr[i]+berechneSumme(arr,i +1);
            //Addiere das aktuelle Element mit der Summe der restlichen Elemente
        }

    }


    public static void main(String[] args) {

        //Testen der Methode mit einem Beispiel Array
        int[] array={1,2,3,4};
        System.out.println("Folgende Zahlen werden ans Array übergeben: "+array.length);
        int summe = berechneSumme(array,0);
        System.out.println("Die Summe aller Zahlen beträgt:"+summe);
    }
}
