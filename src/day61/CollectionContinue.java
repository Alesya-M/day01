package day61;

import java.util.*;

public class CollectionContinue {
    public static void main(String[] args) {

        Collection<Integer>nums= new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6));
        System.out.println("nums = " + nums);
        
        List<Integer> nums2= new ArrayList<>(Arrays.asList(10,33,44,5,1));
        Collections.sort(nums2);
        System.out.println("nums2 = " + nums2);
        
    }
}
