package Übungen_PR1_Gerzic.Arrays;

import java.util.Arrays;

public class ArrayUmgekehrt {
    public static void main(String[] args){
        int[] array ={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(ausgabe(array)));
    }


    public static int[] ausgabe(int[] number){
        int[] array1= new int[number.length];
        int count =0;

        for(int i= number.length-1;i >=0; i--){
            array1[count]=number[i];
            count++;//Zählt von 0 an weg
        }



       return array1;
    }
}
