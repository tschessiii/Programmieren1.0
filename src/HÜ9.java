import java.util.Scanner;

public class HÜ9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie eine Zahl durch die sie teilen wollen:");
        int x = scanner.nextInt();

        if (x == 0) {
            System.out.println("Ungültige Eingabe, zahl darf nicht null sein!");
            return;
        }
        System.out.println("Die Zahlen von 1 bis 100 die durch " +x+ " teilbar sind: ");
        int nummer= 1;
        while (nummer<=100){
            if (nummer % x == 0){
                System.out.println(nummer + " ");
            }
            nummer++;
        }
        scanner.close();
    }


}
