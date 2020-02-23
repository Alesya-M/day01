package day64;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_ValuesView2 {
    public static void main(String[] args) {

        Map<String,Double> groceryPriceMap= new HashMap<>();
        groceryPriceMap.put("Tomato",1.99);
        groceryPriceMap.put("Milk",2.99);
        groceryPriceMap.put("Bread",1.50);
        groceryPriceMap.put("Candy",1.99);

        System.out.println("groceryPriceMap = " + groceryPriceMap);

        Collection<Double>allPrices = groceryPriceMap.values();

        allPrices.removeIf(eachPrice->eachPrice==1.99);
        System.out.println("groceryPriceMap = " + groceryPriceMap);


        

    }
}
