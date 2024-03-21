package Übungen_PR2.ShoppingCenter;

import java.util.HashMap;
import java.util.Map;

public class GenericShop<T> {

    private String name;
    private Map<String, T> products = new HashMap<>();


    public void sellAProduct(String productname){
        products.remove(productname);
    }


    public GenericShop(String name, HashMap<String, T> products) {
        this.name = name;
        this.products = products;
    }

    public void addProductsFromDelivery(HashMap<String, T> deliveredProducts){
        products.putAll(deliveredProducts);
        deliveredProducts.clear();
    }

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
