package day37;
import java.util.*;

public class tasks {

    /**
     * This method accept an ArrayList of integer object.
     * @param numbers
     */

    public static void insert100BetweenItemsOfList(List<Integer> numbers){

        for (int x = 0; x < numbers.size(); x+=2) {

            numbers.add(x,100);

        }

    }

    public static void main(String[] args) {
/**
 * Given a ArrayList of 6 Integer 1,3,7,2,12,7
 * insert 100 in between each numbers
 * For example :
 * 1,100,3 ,100, 7, 100, 2, 100, 12, 100, 7
 *
 * Optionally make it a method
 * write a static void method that accept a ArrayList of integer object and insert 100 in between items.
 *
 */

        List<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(7);
        numbers.add(2);
        numbers.add(12);
        numbers.add(7);


        numbers.add(numbers.size()-1,100);
        System.out.println("Before method = " + numbers);

        insert100BetweenItemsOfList(numbers);
        System.out.println(numbers);

//        numbers.add(1,100);
//        System.out.println("numbers = " + numbers);
//        numbers.add(3,100);
//        System.out.println("numbers = " + numbers);
//        numbers.add(5,100);


    }


}
