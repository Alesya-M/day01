package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.*;


public class SetInterface2 {
    public static void main(String[] args) {

        List<Integer>numList= Arrays.asList(10,10,20,20,30,30,30,30);
        System.out.println("numList = " + numList);

        Set<Integer> myNumSet = new HashSet<>(numList);
        System.out.println("myNumSet = " + myNumSet);
        
        Set<String>states= new HashSet<>();
        //"California","Florida","Arizona","Oregon","Washington");
        states.addAll(Arrays.asList("California","Texas","Florida","Arizona","Oregon","Washington","California","Florida","Florida"));
        states.remove("Texas");
        System.out.println("states = " + states);
        
        //System.out.println("states = " + states);
        //any type of collection has size method to count the item
        System.out.println("How many ? states.size() = " + states.size());
//        for(String each: states){
//            System.out.println("each = " + each);
//        }
        //We can use iterator for any type of collection at all time

        //Creating iterator
//        Iterator<String>stIterator = states.iterator();
//
//        while (stIterator.hasNext()){
//            System.out.println("stIterator.next() = " + stIterator.next());
//        }
        states.forEach(each -> System.out.println("each state = " + each));

        
        
    }
}
