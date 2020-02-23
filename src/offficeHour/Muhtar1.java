package offficeHour;
import java.util.Arrays;
import java.lang.reflect.Array;

public class Muhtar1 {
    public static void main(String[] args) {

        //Task 1

        //Write a program that will remove all the duplicated from a string.Do it with arrays

        String s1 = "aaabbbaaaccbbdd";//expected result: abcd
        String s2 ="";

        for (int i = 0; i < s1.length(); i++) {

            String eachChar = ""+s1.charAt(i); // add "" an d it will be string
            if(!s2.contains(eachChar)) {
                s2 += eachChar; // we only concat the character if that character does not exist in s2
            }

        }

        System.out.println(s2);

        //Task 2 with an array

        String fiveMin = "abcabc";
        String[] eachChar =  fiveMin.split(""); //empty string splitting letter by letter

        String result = "";//to store non-suplicated String objects of the array
        for (String each : eachChar){
            if(!result.contains(each)){
                result += each;
            }
        }
        System.out.println(result);




    }
}
