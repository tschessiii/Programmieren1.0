import javax.swing.text.Style;
import java.util.Scanner;

public class HÜ8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Eingabe einer positiven Zahl
        System.out.println("Bitte geben Sie eine positive Zahl ein:");
        int zahl = scanner.nextInt();

        //Überprüfen ob Positiv
        if(zahl <0){
            System.out.println("Die Angegebene Zahl ist nicht positiv!");
        }else {
            double sum = ausgabe(zahl);
            System.out.println("Die Summe aller Zahlen von "+zahl+ " beträgt "+sum);
        }
    }
    public static double ausgabe(int a){
        int sum =0;
        for  (int i = 0; i <=a; i++){
            sum +=i;
        }
        return sum;
    }


}




