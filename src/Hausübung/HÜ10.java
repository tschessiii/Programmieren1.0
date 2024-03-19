package Hausübung;

public class HÜ10 {
    public static void main(String[] args){

        System.out.println("Das sind alle vollkommenden Übungen.Zahlen:");
        for (int i = 1; i <= 10000; i++){
            if (istperfekt(i)){
                System.out.println(i);
            }
        }

    }

    public static boolean istperfekt(int num){
        int sum = 0;

        for(int i = 1; i < (num -1) ; i++ ){
            if (num % i ==0){
                sum += i;
            }
        }
        return sum == num;
    }





}
