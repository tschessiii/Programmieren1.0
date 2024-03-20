package Übungen_PR1.Arrays;

import java.util.Arrays;

public class Uebung_Array {

    public static void main(String[] args){

        //einfache Weise
        int a= 4;
        int b= 5;
        int c= 6;

        //......
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //.....

        //Übungen_PR1.AllgemeineÜbungen.Arrays.Array erstellen
        int[] array = new int[3];
        array[0]=4;
        array[1]=5;
        array[2]=5;

        //Übungen_PR1.AllgemeineÜbungen.Arrays.Array Ausgeben
        System.out.println(array);//bekommt man giblisch herraus "[I@65ab7765"
        System.out.println(Arrays.toString(array));

        //Übungen_PR1.AllgemeineÜbungen.Arrays.Array mit einer anderen Art erstellen
        int[] arr= {4,5,6};
        for (int i = 0; i < arr.length;i++ ){
            System.out.println(arr[i]);
        }
        //Eine andere Art der Vorschleife
        for (int element: arr){
            System.out.println(element + " ");
        }
    }
}
