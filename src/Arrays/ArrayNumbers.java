package Arrays;

public class ArrayNumbers {
    public static void main(String[] arsg) {
        int[] numbers = {1, 2, 3, 4, 5}; //Arrays.Array auffüllen
        int n = 5;
        System.out.println("Ist " + n + " im Arrays.Array vorhanden? " + printarray(numbers, n));
    }

    //Methode zum Überprüfen ob der Wert n drin ist
    public static boolean printarray(int[] numbers, int n) {
        for (int number : numbers) {//Die Variable Number läuft im Element Numbers jedes Element durch
            if (number == n) {
                return true;
            }

        }

        return false;
    }
}