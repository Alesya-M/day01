package day38;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
import java.util.*;

public class sortingALIstObject {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(300,200,700,800,600));
        System.out.println("before sorting = "+nums);

        // 2 ways to sort an ArrayList
        // Use Collections utility class( just like Arrays utility class for array objects)

        Collections.sort(nums);

        System.out.println("after sorting = "+nums);

        //This version of sort method accept 2 arguments
        //1st is the list to be sorted
        //2nd a Comparator Object that contains comparing logic
        //good news is there is ready method already in java
        // we can get reverse order comparator object by calling
        // Comparator. reverseOrder(), just take it and use it
        Collections.sort(nums, Comparator.reverseOrder());
        System.out.println("nums after sort2 = " + nums);



        nums.sort(Comparator.naturalOrder());
        System.out.println("nums after using = nums.sort(Comparator.naturalOrder()) +\n"+nums);
        nums.sort(Comparator.reverseOrder());
        System.out.println("nums after using = nums.sort(Comparator.reverseOrder()) +\n"+nums);
    }
}
