import java.util.Scanner;

public class Passwort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pw;


        do {
            System.out.println("Geben Sie ihr Passwort ein:");
            pw = scanner.next();

        } while (!pw.equals("geheim"));

        System.out.println("Passwort korrekt!");

    }

}
