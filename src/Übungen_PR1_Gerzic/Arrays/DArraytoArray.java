package Übungen_PR1_Gerzic.Arrays;

import java.util.Arrays;

public class DArraytoArray {
    //2D Übungen_PR1.AllgemeineÜbungen.Arrays.Array zu einem normalen Übungen_PR1.AllgemeineÜbungen.Arrays.Array


   public static void main(String[] args){
       int[][] array ={{10,11,12},{20,21,22},{30,31,32}};

       int length = 9;
       int[] array2 = new int[length];
       int counter = 0;

       int sum=0;

       for(int i=0; i< array.length; i++){
           for (int j = 0; j<array.length; j++){
               array2[counter]=array[i][j];
               counter++;
               if(i==j){
                   //System.out.println(array[i][j]);

                   //errechnet die Summe
                   sum += array[i][j];
               }
           }
       }
       System.out.println(Arrays.toString(array2));
       System.out.println(sum);
       System.out.println(array[0][0] + array[1][1] + array[2][2]);
   }
}
