package Generics;

public class Main {
    public static void main(String[] args) {
//        StringPrinter stringPrinter = new StringPrinter();
//        IntPrinter intPrinter = new IntPrinter();
//        DoublePrinter doublePrinter = new DoublePrinter();
//        FruitPrinter fruitPrinter = new FruitPrinter();
//
//        stringPrinter.print("Print Me");
//        intPrinter.print(123);
//        doublePrinter.print(1.234);
//        fruitPrinter.print(new Fruit(Color.ORANGE,"Orange", 12));


        //Einfachere Methode, um nicht 100 Klasen erstellen zu müssen
        GenericPrinter<String> stringPrinter = new GenericPrinter<>();
        GenericPrinter<Integer> integerPrinter = new GenericPrinter<>();
        GenericPrinter<Double> doublePrinter = new GenericPrinter<>();
        GenericPrinter<Fruit> fruitPrinter = new GenericPrinter<>();

        stringPrinter.print("Print Me");
        integerPrinter.print(123);
        doublePrinter.print(1.234);
        fruitPrinter.print(new Fruit(Color.ORANGE,"Orange", 12));

    }
}
