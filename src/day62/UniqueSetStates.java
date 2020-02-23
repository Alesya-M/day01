package day62;

import java.util.*;
public class UniqueSetStates {
    public static void main(String[] args) {

        Set<String> states= new HashSet<>();

        states.addAll(Arrays.asList("California","Texas","Florida","Arizona","Oregon","Washington","California","Florida","Florida"));

        states.remove("Texas");
        System.out.println("states = " + states);

        Iterator<String>stIter = states.iterator();
        while(stIter.hasNext()){
            String each = stIter.next();
            if(each.contains("A")){
                System.out.println("Removing = " + each);
                stIter.remove();
            }
            System.out.println("states after = " + states);
        }


    }
}
