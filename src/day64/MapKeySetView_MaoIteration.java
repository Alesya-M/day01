package day64;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapKeySetView_MaoIteration {
    public static void main(String[] args) {

        Map<String,Double> groceryPriceMap= new HashMap<>();
        groceryPriceMap.put("Tomato",1.99);
        groceryPriceMap.put("Milk",2.99);
        groceryPriceMap.put("Bread",1.50);
        System.out.println("groceryPriceMap.get(\"Apple\") = " + groceryPriceMap.get("Apple"));

        Set<String>allNames = groceryPriceMap.keySet();
        
        for(String eachName : allNames){
            System.out.println("eachName = " + eachName);
            System.out.println("value is = " + groceryPriceMap.get(eachName));
        }

    }
}
