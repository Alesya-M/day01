package day64;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_entrySet_view {
    public static void main(String[] args) {


        Map<String,Double> groceryPriceMap= new HashMap<>();
        groceryPriceMap.put("Tomato",1.99);
        groceryPriceMap.put("Milk",2.99);
        groceryPriceMap.put("Bread",1.50);
        groceryPriceMap.put("Candy",1.99);


        
        Set<Map.Entry<String,Double>> entryView = groceryPriceMap.entrySet();

        for (Map.Entry<String,Double> each : entryView){

            System.out.println("Key for current Entry is = " + each.getKey());
            System.out.println("Value for current Entry is = " + each.getValue());
            if(each.getKey().length()==5){
                each.setValue(15.0);
            }

        }
        System.out.println("groceryPriceMap = " + groceryPriceMap);
        
    }
}
