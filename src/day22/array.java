package day22;

public class array {

    public static void main(String[] args) {


        int[] nums = new int[7];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = 6;
        nums[6] = 7;

        //2nd way to create an array with values already filled
        int[] nums2 = new int[]{11, 2, 34, 4, 53, 6, 3};
        //3rd and shortest way
        int[] nums3 = {11, 2, 34, 4, 53, 6, 3};

        for (int x = nums.length-1; x >=0 ; x--) {

            System.out.println("item = " +nums[x]);

        }

        int arraySize = nums.length;
        int lastItemIndex = arraySize-1;

        int lastItemValus = nums[lastItemIndex];
        System.out.println("last Item Value = " + lastItemValus);

        int middleItemIndex = arraySize/2;
        System.out.println("middle item value = " + nums[middleItemIndex]);

        int sum = 0;
        for (int x = 0; x <arraySize ; x++) {
            int currentItem = nums[x];
            sum = sum + nums[x];

        }
        System.out.println("sum="+sum);






    }
}
