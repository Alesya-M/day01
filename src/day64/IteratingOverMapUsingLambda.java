package day64;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IteratingOverMapUsingLambda {
    public static void main(String[] args) {

        Map<String,Double> groceryPriceMap= new HashMap<>();
        groceryPriceMap.put("Tomato",1.99);
        groceryPriceMap.put("Milk",2.99);
        groceryPriceMap.put("Bread",1.50);
        groceryPriceMap.put("Candy",1.50);
        groceryPriceMap.put("Soda",1.30);
        
        groceryPriceMap.forEach(   (name,price)-> System.out.println("name+price = " + name+" "+ price)   );
        
   

  
        }

    }

