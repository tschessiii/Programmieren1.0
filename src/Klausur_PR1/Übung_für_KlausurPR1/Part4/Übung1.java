package Klausur_PR1.Übung_für_KlausurPR1.Part4;

public class Übung1 {

    public static void main(String[] args) {
        double[][] arr = {{8.8, 12}, {134,67.92,45,32.4,76}, {1}, {0, 0.56}};
        double sum = 0;

        for(double[] arry : arr){

            for(double a : arry){
                System.out.println(a);
                sum += a;
            }
        }


        System.out.println("Summe beträgt bei sum:"+sum);


    }
}
