package day36;

import java.util.Arrays;

public class methodPractice2 {
    public static void main(String[] args) {

        long [] myLongs = {6L, 11L, 44L,32L, 65L};
        System.out.println("before the method= "+ Arrays.toString(myLongs));

        swampFirstAndLAstValue(myLongs);
        System.out.println("after method = "+ Arrays.toString(myLongs));

    }

    public static void swampFirstAndLAstValue(long[] nums){

        long temp = nums[0];
        nums[0] = nums[ nums.length-1];  //Swapping the first value with the last
        nums[ nums.length-1] = temp;


    }

}
