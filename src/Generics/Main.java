package Generics;

public class Main {
    public static void main(String[] args) {
        StringPrinter stringPrinter = new StringPrinter();
        IntPrinter intPrinter = new IntPrinter();
        DoublePrinter doublePrinter = new DoublePrinter();
        FruitPrinter fruitPrinter = new FruitPrinter();

        stringPrinter.print("Print Me");
        intPrinter.print(123);
        doublePrinter.print(1.234);
        fruitPrinter.print(new Fruit(Color.ORANGE,"Orange", 12));
    }
}
