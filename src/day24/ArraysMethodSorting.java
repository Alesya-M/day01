package day24;

import java.util.Arrays; //Do Not call your class ARRAYS!

public class ArraysMethodSorting {

    public static void main(String[] args) {

        int[] scores ={99,44,66,23,19,55};

        System.out.println(Arrays.toString(scores));
        System.out.println("original first item value : " + scores[0]);
        //for sorting an array in ascending order -- low to high
        //sort --->> Arrays.sort(yourArrayHere)
        Arrays.sort(scores);
        //So what happen to my original order? Gone!
        //Can I get it Back? No!
        //The original index of items has changed!
        System.out.println(Arrays.toString(scores));
        System.out.println("new first item value : " + scores[0]);

        char[] nameChars = {'G',' ','d','Z','9','A',};
        System.out.println("before sorting nameChars = " + Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println("after sorting nameChars = " + Arrays.toString(nameChars));

        //the low to high order for character is decided by it's ascii table value
        // special characters comes first, number, uppercase then lowercase

        System.out.println("-------STRING SORTING--------");
        String [] superHeroes = {"Superman","Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash", "100", "9","09"};
        System.out.println("before sorting superHeros = " + Arrays.toString(superHeroes) );
        Arrays.sort(superHeroes);
        System.out.println("after sorting superHeros = " + Arrays.toString(superHeroes) );
        //ONLY THE FIRST CHARACTER MATTER WHEN SORTING STRING!!! EVEN NUMBERS ONLY FIRST CHARACTER

        System.out.println("-------STRING BOOLEAN--SORT DOES NOT WORK FOR BOOLEAN ARRAY------");
        boolean[] fiveSwitchOnOffs = {true, false, false, true, true};
        System.out.println("fiveSwitchOnOffs = " + Arrays.toString(fiveSwitchOnOffs));
        //Arrays.sort(fiveSwitchOnOffs);



    }
}
