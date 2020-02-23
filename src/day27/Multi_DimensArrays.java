package day27;

import java.util.Arrays;

public class Multi_DimensArrays {
    public static void main(String[] args) {

        /*
        Single dimensional array: contains values
              int [] arr = {1,2,3};

         Multi-dimensional array: an Array that can contain array(s)
                     N dimensional Array contains ( N-1) demensional arrays

        */

        int[] arr1D = {1,2,3};
        //2D array: is an array that contains single dimensional arrays
         //               0 1 2    0 1 2
        int[][] arr2D = {{1,2,3,},{4,5,6}}; //2 DIMENSIONAL ARRAY
        //index            0         1

        System.out.println(arr2D.length);
        System.out.println(Arrays.toString( arr2D[0]) );
        System.out.println(Arrays.toString( arr2D[1]));

        //arr2D[0] [2] ===> 3
        System.out.println( arr2D[0][2]); ///DONT NEED TO CONVERT TO STRING METHOD BECUASE IT RETURNS SINGLE INT VALUE
        System.out.println(arr2D[1][1]);  //returns INT VALUE

        System.out.println(Arrays.toString(arr2D[1])); //Arrays.toString IS ONLY APPLICABLE TO ONE DIMENSIONAL ARRAYS!!!!!!

        //Arrays.deepToString ( multi-D Arrays) :

        System.out.println(Arrays.deepToString(arr2D));



    }
}
