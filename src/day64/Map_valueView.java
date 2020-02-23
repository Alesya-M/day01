package day64;

import java.util.*;

public class Map_valueView {
    public static void main(String[] args) {

        Map<String,Double> groceryPriceMap= new HashMap<>();
        groceryPriceMap.put("Tomato",1.99);
        groceryPriceMap.put("Milk",2.99);
        groceryPriceMap.put("Bread",1.50);
        groceryPriceMap.put("Candy",1.99);

        System.out.println("groceryPriceMap = " + groceryPriceMap);


        Collection<Double>allPrices = groceryPriceMap.values();
        System.out.println("allPrices = " + allPrices);

        allPrices.remove(1.99);
        System.out.println("allPrices = " + allPrices);
        System.out.println("groceryPriceMap = " + groceryPriceMap);

        List<Double>pricesCopy = new ArrayList<>(allPrices);


    }
}
