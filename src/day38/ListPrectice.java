package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPrectice {

    public static void main(String[] args) {




        Integer[] nums = new Integer[] {1,4,5,7,8,5,3,2,19} ;
        List<Integer> numsLst = Arrays.asList(nums);
        Integer[] numsArr = numsLst.toArray(new Integer[12]);


        Integer[] nums2 =  new Integer[] {1,4,5,7,8,5,3,2,19};
        List<Integer> numLst = new ArrayList<>(Arrays.asList(3,4,5,6,7,8));
        // turn this ArrayList into int array
    }
}
