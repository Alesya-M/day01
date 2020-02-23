package day27;

import java.util.Arrays;

public class MultiDimenArrays3D {

    public static void main(String[] args) {

        //2D Array: contains 1 dimensional array
        int[][] arr2D = { {1,2,3},{4,5,7} };

        //3D Array : contains 2D arrays
//                                 0      1              0       1
        int[][][] arr3D = {  { {1,2,3},{4,5,7}}  ,  { {1,7,3},{88,5,7} }  };
        //                             0                     1
        //[index num of 2D array] [index num of single dimens array] [index num of each value]
//    ((                3 D ARRAY!!!                                                             ))
        //print 88:
        System.out.println(arr3D[1][1][0]);
        //print 2:
        System.out.println( arr3D[0][0][1]);//returns value
        //print{1,2,3}
        System.out.println(Arrays.toString(arr3D[0][0])); //returns 1d array

        System.out.println(Arrays.toString(arr3D[1][1]));
        //Print the 2D Array
        System.out.println( Arrays.deepToString(arr3D[1])); //returns 2D Array
        //PRINTING ENTIRE ARRAY
        System.out.println( Arrays.deepToString(arr3D));

        for (int i = 0; i < arr3D.length; i++) {
            System.out.println("2D ARRAY---> "+i);

            for (int j = 0; j < arr3D[i].length; j++) {
                System.out.println("Array index number---> "+j);
                for (int k = 0; k < arr3D[i][j].length; k++) {
                    System.out.println("EACH ITEM OF EACH ARRAY: "+ arr3D[i][j][k]);
                }

            }

        }






    }
}
