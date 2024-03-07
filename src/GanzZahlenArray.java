public class GanzZahlenArray {
    public static void main(String[] args){
     int[] array = {3,6,8,4,2,7,9}; //Array auffüllen
     printArray(array); //Methode ausgeben

    }

    public static void printArray(int[] numbers){
        Array(numbers); //Eine Methode erstellt mit einer anderen methode
    }

    private static void Array(int[] numbers) {
        for (int number : numbers) { //Wir übergeben der int number die numbers
            System.out.printf(number+ "," ); //Zahlen ausgeben
        }
    }
}
