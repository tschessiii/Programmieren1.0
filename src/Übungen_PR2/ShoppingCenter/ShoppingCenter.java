package Übungen_PR2.ShoppingCenter;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCenter {

    public static void main(String[] args) {

        GenericShop<Candy> candyshop = new GenericShop<>("Sweet Point",new HashMap<String, Candy>());




        Map<String, Candy> candies = new HashMap<>();
        candies.put("pinkCandy",new Candy("pink","pinkCandy",2.1, "sour","round"));
        candies.put("redCandy",new Candy("red","redCandy",6.1, "sweet","heart"));
        candies.put("blueCandy",new Candy("blue","blueCandy",2.1, "sour","round"));
        candies.put("stripedCandy",new Candy("blue-white","stripedCandy",9.1, "sweet","square"));

        DeliveryService<Candy> candyDelivery = new DeliveryService<>(candies);

        candyshop.showProduct();
        candyshop.addProductsFromDelivery((HashMap<String, Candy>) candyDelivery.getProductsToDeliver());
        candyshop.showProduct();




    }
}
