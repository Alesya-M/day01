package day27;

import java.util.Arrays;

public class MultiDimArraysString {

    public static void main(String[] args) {

        // Multi-dimensional array: an Array that can contain array(s)
        //                     N dimensional Array contains ( N-1) demensional arrays
        //2 dimensin array MUST contain (2-1) dimensional srrays

            //                  0          1       0         1
        String [][] names = {{"Kolya", " Gena"},{"Alesya","Irina"} };
        //                            0                    1

        System.out.println(names[1][0]);

        names[1][1] = "Vasya";
        System.out.println(names[1][1]);

        System.out.println(Arrays.toString(names[1]));

        //PRINT ENTIRE STRING

        System.out.println(Arrays.deepToString( names ));

        int[][] numbers = {{1,2,3},{4,5,6},{7,8,9},{5,6,7,33}};

        for (int x = 0; x < numbers.length; x++) { //checks each index of 2D arrays

            //System.out.println(Arrays.toString(numbers[x]));

            for (int y = 0; y < numbers[x].length; y++) { //checks each elements of single array element

                System.out.println(numbers[x][y]+ " ");

            }
        }

        System.out.println("=======================");

        int[][] ages = {{10}, {12,13,14,16,17} ,{19, 20,21,22,23} };
        for (int i = 0; i < ages.length; i++) {

            for (int j = 0; j < ages[i].length; j++) {
                //int ifnum=ages[i][j];

                if(ages[i][j]%2!=0){
                    continue;
                    //System.out.println("EVEN NUMBER: "+ ages[i][j]);
                }
                System.out.println("EVEN NUMBER: "+ ages[i][j]);

            }

        }
        System.out.println("=======================");

        int[] arr1D ={1,2,3};
        for (int each : arr1D) {
            System.out.println(each+ " ");

        }

        System.out.println("\n=======================");
        int [][] arr2D = {{10,20,30},{40,50,60,70,80,90}};

        for( int [] each1DArray : arr2D ){
            for (int eachElement : each1DArray) {
                System.out.println(eachElement+" ");

            }


           // System.out.println(Arrays.toString(each1DArray));
        }



    }
}
