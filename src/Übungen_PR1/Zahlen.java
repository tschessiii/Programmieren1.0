package Übungen_PR1;

public class Zahlen {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getFizzBuzzOutput(i));
        }
    }

    public static String getFizzBuzzOutput(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
