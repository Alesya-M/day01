package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReveiw {

    public static void main(String[] args) {


        int num = 10;
        int[] arr = {10,20, 30, 40, 50, 60};
        int num1 = arr[arr.length -1]; //6

        System.out.println(num1);
        System.out.println("=======================");
        // the variable x represents the index number of each element of the array
        for (int x = 0; x <=arr.length-1 ; x++) {

            System.out.print( arr[x]+" " );

        }
        System.out.println("\n=======================");
       // Arrays.toString(arr);
        String str = Arrays.toString(arr);
        System.out.println(str);

        Scanner scan = new Scanner(System.in);

        int[] numbers= new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number 5 times:");
            int input = scan.nextInt();
            numbers[i]=input;

        }
        String numbScan = Arrays.toString(numbers);
        System.out.println(numbScan);


        //SORT METHOD  ----Arrays.sort(variableName) : sort the array in ascending order
        Arrays.sort(numbers);

        int largestNumber = numbers[numbers.length-1];
        int minNumber = numbers[0];

        System.out.println("Largest number is: "+ largestNumber);
        System.out.println("Minimum number is: "+minNumber);

        //TASK02
        //write a program that can find the minimum number from an int array

        int[] scores={100, 90, 900, 8000, 10, 20, -1};




    }


}
