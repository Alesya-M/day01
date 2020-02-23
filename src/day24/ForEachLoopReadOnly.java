package day24;

public class ForEachLoopReadOnly {

    public static void main(String[] args) {

        int yourFavoriteNumber = 300 ;
        int myFavNumber = yourFavoriteNumber ;

        myFavNumber = 299 ;
        System.out.println(yourFavoriteNumber);
        long[] nums = {10, 40, 20};

        //nums[0]=nums[0]*2;  //nums[0] *=2 ;
        //System.out.println(nums[0]);

        for (int x = 0; x < 3; x++) {
           //nums[x] = nums[x] * 2 ;
           long eachItem = nums[x];
           eachItem = 100;
        }

        for(long eachItem : nums ){
            eachItem = 100 ;
        }
        //Never use for each loop to modify array items!!!
        //DON'T USE FOR EACH LOOP FRO MODIFYING!!!


        System.out.println("After we modify the value ");
        for (int x = 0; x < 3; x++) {
            System.out.println(nums[x]);
        }




    }
}
