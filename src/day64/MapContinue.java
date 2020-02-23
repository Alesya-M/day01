package day64;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapContinue {
    public static void main(String[] args) {

        Map<String,Double> groceryPriceMap= new HashMap<>();
        groceryPriceMap.put("Tomato",1.99);
        groceryPriceMap.put("Milk",2.99);
        groceryPriceMap.put("Bread",1.50);
        System.out.println("groceryPriceMap = " + groceryPriceMap);

        Set<String> allNames= groceryPriceMap.keySet();
        System.out.println("allNames = " + allNames);

//        allNames.remove("Tomato");
//        System.out.println("allNames no tomato = " + allNames);
//        System.out.println("groceryPriceMap after = " + groceryPriceMap);
        
        Set<String>namesCope = new HashSet<>(allNames);
        //Set<String>namesCope = new HashSet<>(groceryPriceMap.keySet());
        namesCope.remove("Milk");
        System.out.println("namesCope no milk = " + namesCope);
        System.out.println("groceryPriceMap= " + groceryPriceMap);



    }
}
