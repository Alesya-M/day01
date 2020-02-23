package day38;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllMethodPractice {
    public static void main(String[] args) {

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(123);
        nums1.add(100);
        nums1.add(600);
        nums1.add(133);
        nums1.add(500);
        nums1.add(300);
        //remove 100 and 133 at the SAME TIME
        nums1.removeAll(Arrays.asList(100,377));
        System.out.println("After removing 2 items = "+ nums1);
    }
}

