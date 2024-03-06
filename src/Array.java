import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] gerade = new int[100];
        int geradezahl = 2;

        for (int i = 0; i <=99; i++) {
            //Option2- wir machen aus geradezahlen ein int-Array
            gerade[i] =geradezahl;
            //Ausgabe in der Schleife
            geradezahl = geradezahl +2;

        }

        System.out.print(Arrays.toString(gerade));


    }
}
