package day27;

public class ArraysTask02 {

    public static void main(String[] args) {

        // Task02 write a program that returns the maximum number from the array
        //DO NOT USE SORT METHOD

        int[] nums = {100, 444, 656565, 232, 7655, 111};
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if(max<nums[i]){
                max = nums[i];
            }

        }
        System.out.println("First max number: "+ max);


        int secondMax = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(secondMax<nums[i] && nums[i] != max){

                secondMax = nums[i];
            }
        }
        System.out.println("second max number: "+secondMax);

    }
}
