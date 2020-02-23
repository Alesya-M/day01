package day64;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapp {
    public static void main(String[] args) {


        SortedMap<String,Double> groceryPriceMap= new TreeMap<>();
        groceryPriceMap.put("Tomato",1.99);
        groceryPriceMap.put("Milk",2.99);
        groceryPriceMap.put("Bread",1.50);
        groceryPriceMap.put("Candy",3.50);
        groceryPriceMap.put("Apple",5.50);



        System.out.println("groceryPriceMap = " + groceryPriceMap);
    }
}
