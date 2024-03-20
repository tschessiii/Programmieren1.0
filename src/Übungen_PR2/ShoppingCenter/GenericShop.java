package Übungen_PR2.ShoppingCenter;

import java.util.HashMap;
import java.util.Map;

public class GenericShop<T> {

    private String name;
    private Map<String, T> products = new HashMap<>();


    //public void addProductsFromDelivery(DeliveryService<T>ds){

    // }

    public void showProduct() {
        System.out.println("Welcome to " + name);
        if (products.isEmpty()) {
            System.out.println("Ist ausverkauft!");
        } else {
            for (String s : products.keySet()) {
                System.out.println("Name:" + s + " |Produkt:" + products.get(s));
            }
        }
    }
}
