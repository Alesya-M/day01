package day29;

import java.util.Arrays;

public class FillUpString {

    public static void main(String[] args) {

        String[] javaa = new String[300];

        for (int x = 0; x < javaa.length; x++) {
            javaa[x] = "I LOVE JAVA";
        }
        System.out.println(Arrays.toString(javaa));

        System.out.println("===================================");


        String[] str = new String[]{"i love java"};
        //               \n will move it to next line

        String str1  = new String("ABC"); //String object with value ABC
        String[] strArr = new String[5]; //Empty string array with capacity 5;

    }
}
