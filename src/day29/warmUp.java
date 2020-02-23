package day29;

import java.util.Arrays;

public class warmUp {
    public static void main(String[] args) {

        //create an array with size 100 and fill it up as below
        int[] numbers = new int[100];
        //System.out.println(Arrays.toString(numbers));

        for (int x = 0; x < numbers.length; x++) {
            numbers[x]= x+1;

        }
        System.out.println(Arrays.toString(numbers));

    }
}
