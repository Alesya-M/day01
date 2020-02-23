package day63;
import java.util.*;
public class MapAddingElements {
    public static void main(String[] args) {

        Map<String,Integer>nameAgePair = new HashMap<>();

        //adding elements: put
        nameAgePair.put("Zehra",6);
        nameAgePair.put("Aika",7);
        nameAgePair.put("Alesya",101);
        nameAgePair.put("Nikolay",103);
        nameAgePair.put("Irina",104);
        nameAgePair.put("Gena",55);
        nameAgePair.put("Zehra",8);
        nameAgePair.putIfAbsent("Gena",35);

        System.out.println("nameAgePair = " + nameAgePair);
        
        //getting the size of a map
        System.out.println("nameAgePair.size() = " + nameAgePair.size());

        System.out.println("nameAgePair.containsKey(\"Alesya\") = " + nameAgePair.containsKey("Alesya"));

        //How do I only add new items if it does not already exists

        System.out.println("Age of Alesya = "+ nameAgePair.get("Alesya"));

      //Updating the element in the map using replace
        nameAgePair.replace("Gena",45);
        System.out.println("nameAgePair.get(\"Gena\") = " + nameAgePair.get("Gena"));
        
        //USE UPDATE not PUT!!
        
        //Updating the value only if the old vale is equals to a specified value
        
        nameAgePair.replace("Gena",45,35);
        System.out.println("nameAgePair.get(\"Gena\") = " + nameAgePair.get("Gena"));
        
        //Removing Entry
        nameAgePair.remove("Gena");
        System.out.println("nameAgePair = " + nameAgePair);




        
    }
}
