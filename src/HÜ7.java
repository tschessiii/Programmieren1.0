import java.util.Scanner;

public class HÜ7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Wählen Sie hier ihren gewünschten umrechner:");
        System.out.println("1. Euro in USD");
        System.out.println("2. Euro in CZK");
        System.out.println("3. Euro in HUF");
        System.out.println("4. Euro in PLN");
        int choice = scanner.nextInt();

        if (choice ==1){
            System.out.println("Geben Sie hier ihre Geldsumme ein:");
            int sum1 = scanner.nextInt();
            double result= sum1* 1.08;
            System.out.println(sum1+ "€ betragen "+result+ " Dollar");
        } else if (choice == 2) {
            System.out.println("Geben Sie hier ihre Geldsumme ein:");
            int sum2 = scanner.nextInt();
            double result= sum2* 25.37;
            System.out.println(sum2+ "e betragen "+result+ " Tschechische Kronen");
        } else if (choice == 3) {
            System.out.println("Geben Sie hier ihre Geldsumme ein:");
            int sum3 = scanner.nextInt();
            double result= sum3* 395.31;
            System.out.println(sum3+ "€ betragen "+result+ " Forint");
        } else if (choice == 4) {
            System.out.println("Geben Sie hier ihre Geldsumme ein:");
            int sum4 = scanner.nextInt();
            double result= sum4* 4.33;
            System.out.println(sum4+ "€ betragen "+result+ " Złoty");
        }else {
            System.out.println("Falsche Eingabe. Bitte eine Option zwischen 1 und 4.");
        }


    }
}
