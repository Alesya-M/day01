package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot {

    public static void main(String[] args) {

        int[] nums = {13,31,8,5,21,2} ;
        System.out.println("nums = "+ Arrays.toString(nums));
        int numsItemCount = nums.length;
        //I want to cope the content of nums array into the new array

        //creating an array with same size as original array
        int [] numsCopy = new int[numsItemCount];
        numsCopy[0] = nums[0] ;//13 ;
        numsCopy[1] = nums[1] ;
        numsCopy[2] = nums[2] ;
        numsCopy[3] = nums[3] ;
        numsCopy[4] = nums[4] ;
        numsCopy[5] = nums[5] ;

        for (int x = 0; x < numsItemCount; x++) {

            numsCopy[x] = nums[x] ;
        }

        System.out.println("Before sort numsCopy = "+ Arrays.toString(numsCopy));

        Arrays.sort(numsCopy);
        System.out.println("After sort numsCopy = "+ Arrays.toString(numsCopy));

        //Check whether the array still have same content in the same order after sorting
        //what method will check for content

        if ( Arrays.equals(nums, numsCopy)){

            System.out.println("THIS IS ALREADY SORTED");
        } else{
            System.out.println("THIS ARRAY IS NOT ALREADY SORTED");
        }





    }
}
