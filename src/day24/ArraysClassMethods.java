package day24;

import java.util.Arrays;

public class ArraysClassMethods {

    public static void main(String[] args) {

        //Arrays class a class coming from java.util package
        //it has a lot of pre-built method to work with array object

        //for printing the content of the array
        //toString --->> Arrays.toString(yourArrayHere)
        //This method will give you string representation of any type of array
        //the result will look ---->> [item1, item2, item3,....lastItem]

        String [] superHeroes = {"Superman","Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash"};

        System.out.println(Arrays.toString(superHeroes));
        //saving the string result into a variable and print
        String superHerosAsString = Arrays.toString(superHeroes) ;
        System.out.println(superHerosAsString);
        //how do we get first character of superHerosAsString variable
        System.out.println("superHeroesAsString.charAt(0) result : ");
        System.out.println( superHerosAsString.charAt(0) );

        int[] numbers = {10,44,55,3,78};
        System.out.println("");
        System.out.println("Arrays.toString(numbers) RESULT: ");
        System.out.println(Arrays.toString(numbers));

        System.out.println("DOUBLE ARRAY TASK:");

        double[] item = {44,55.6, 2.99};
        String itemString = Arrays.toString(item);
        System.out.println(itemString);

        for (int x = 0; x < itemString.length(); x++) {

            System.out.println("Character at index "+ x + " is : " + itemString.charAt(x));

        }


        //for sorting an array in ascending order
        //sort --->> Arrays.sort(yourArrayHere)

        //for checking fro equality of 2 array object content
        //equals ---->> Arrays.equals(firstArray, secondArray)
    }
}
