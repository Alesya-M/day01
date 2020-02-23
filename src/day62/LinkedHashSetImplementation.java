package day62;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetImplementation {
    public static void main(String[] args) {

        Set<Integer> nums = new LinkedHashSet<>();
        nums.add(20);
        nums.add(66);
        nums.add(55);
        nums.add(44);
        nums.add(66);
        nums.add(66);
        nums.add(99);
        nums.add(22);
        System.out.println("nums = " + nums);

        Set<Integer> nums2 = new HashSet<>();
        nums2.add(20);
        nums2.add(66);
        nums2.add(55);
        nums2.add(44);
        nums2.add(66);
        nums2.add(66);
        nums2.add(99);
        nums2.add(22);
        System.out.println("nums2 = " + nums2);
        
    }
}
