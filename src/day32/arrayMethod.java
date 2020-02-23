package day32;


import java.util.Arrays;

public class arrayMethod {
    public static void main(String[] args) {

        printArrayItems(new int[]{1,6,5,3,12,3});

        int[] scores ={2,5,8,23,4,5,6};
        printArrayItems(scores);
        printMaxOfIntArray(scores);
        printSum(scores);
        compare2arraysSize(new String []{"Temur","Gena"}, new String[]{"Ruslan","Gena","Dima","Vasya"});
        String[] names1 ={"Ruslan","Gena","Dima","Vasya"};
        String[]names2= {"Ruslan","Gena","Dima","Vasya","Temur","Gena"};
        compare2arraysSize(names1,names2);
    }

    static public void printArrayItems(int[] nums ){

        System.out.println("arrays has items: "+ Arrays.toString(nums));

    }

    static public void printMaxOfIntArray(int[] nums){
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }

        }
        System.out.println("Max number: "+max);
    }

    static public void printSum(int[] nums){
        int sum=0;
        for(int each : nums){
            sum=sum + each;
        }
        System.out.println("Sum is "+sum);
    }

    static public void compare2arraysSize(String[] arr1, String[] arr2){

        if(arr1.length>arr2.length){
            System.out.println("arra1 has more items");
        }else if(arr1.length<arr2.length){
            System.out.println("arra2 has more items");
        }else {
            System.out.println("they have same item count");
        }
    }


}

