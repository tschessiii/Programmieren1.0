package Arrays;

public class Array2D {
    public static void main(String[] args){
        int[][] array = new  int[3][3];//Auffüllen eines 2D Arrays
        int[][] array2={{10,11,12},{20,21,22},{30,31,32} };//Andere Methode zum Auffüllen

        //
        for (int i = 0; i< array.length; i++){
            for (int j =0; j< array.length;j++){
               array[i][j]=i+j;
            }
        }


        //
        for (int i =0;i<array.length;i++){
            for (int j=0; j<array[i].length;j++){
                System.out.printf(array[i][j]+" ");
            }
            System.out.println();
        }

        //
        for (int i =0;i<array2.length;i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.printf(array2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
