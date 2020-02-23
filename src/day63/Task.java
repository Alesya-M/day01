package day63;

import java.util.*;

public class Task {
    public static void main(String[] args) {

        Map<String, Double> groceryItems = new HashMap<>();
        groceryItems.put("Milk", 5.23);
        groceryItems.put("Milk", 5.25);
        groceryItems.put("Bread", 5.20);
        groceryItems.put("Squash", 3.15);
        groceryItems.put("Blue Cheese", 6.50);
        groceryItems.put("Chocolate", 4.35);
        groceryItems.put("Pear", 2.99);

        System.out.println("groceryItems = " + groceryItems);

        System.out.println("Bread " + groceryItems.get("Bread"));
        groceryItems.replace("Bread", 5.20 * 2);
        groceryItems.replace("Bread", groceryItems.get("Bread") * 2);

        double newPrice = groceryItems.get("Milk") * 2;
        groceryItems.replace("Milk", newPrice);

        groceryItems.replace("Blue Cheese", groceryItems.get("Blue Cheese") - 1.0);

        if (groceryItems.containsKey("Bread")) {
            groceryItems.remove("Bread");
            System.out.println("No more Bread! For the sake of tight jeans!");
        }




    }


        
    
}

