package day25;

import java.util.Arrays;

public class CheckArrayIfSortedOrNot2 {

    public static void main(String[] args) {

        //int [] nums = {13, 31, 8, 5, 21, 2};
        int [] nums = {1, 5, 8, 9, 21, 25};
        System.out.println("nums = "+ Arrays.toString(nums));

        //Create a variable called isSortedAlready and assign value of true;
        //I assume the array is already sorted
        //And if it is not then I change the value of isSortedAlready to FALSE
        boolean isSortedAlready = true ;


        for (int x = 0; x < nums.length-1; x++) {

            //System.out.println(nums[x]+ " "+ nums [x+1]);

            System.out.println("is " +nums[x]+ " less than "+ nums[x+1] + "? "+(nums[x]<nums[x+1]) );

            if ( ! (nums[x]<nums[x+1]) ){
                System.out.println("ARRAY IS NOT SORTED, NO POINT OF CHECKING THE REST");
                isSortedAlready = false;
                break;
            }



        }
        System.out.println("Sorted already : "+ isSortedAlready);
    }
}
