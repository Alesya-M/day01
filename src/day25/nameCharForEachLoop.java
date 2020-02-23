package day25;

import java.util.Arrays;

public class nameCharForEachLoop {

    public static void main(String[] args) {
        
        //pick up your own name and turn in into char array
        //and use for each loop to loop over them
        //optionally count how many a you have in your name

        String name = "Nikolay Karamov";
        //turn this into charArray using toCharArray() method of String

        char[] nameItem = name.toCharArray();
        
        int counterOfA=0;
          // each item       array variable name      
        for(char eachChar : nameItem ){

            //System.out.println("eachChar = " + eachChar);

            if(eachChar=='a'){

                counterOfA++;

            }


            
        }
        System.out.println("Number of 'a' is= "+counterOfA);
        System.out.println("Before sorting nameItem = " + Arrays.toString(nameItem));
        Arrays.sort(nameItem);
        System.out.println("After sorting nameItem = " + Arrays.toString(nameItem));


    }
}
