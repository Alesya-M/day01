package day64;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {
    public static void main(String[] args) {

        Map<String,Double> groceryPriceMap= new LinkedHashMap<>();
        groceryPriceMap.put("Tomato",1.99);
        groceryPriceMap.put("Milk",2.99);
        groceryPriceMap.put("Bread",1.50);
        groceryPriceMap.put("Candy",3.50);
        groceryPriceMap.put("Apple",5.50);

        System.out.println("groceryPriceMap = " + groceryPriceMap);
    }
}
