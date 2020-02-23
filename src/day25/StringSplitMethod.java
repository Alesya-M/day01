package day25;

import java.util.Arrays;

public class StringSplitMethod {

    public static void main(String[] args) {

        String sentence = "I Love Java";

        String[] allWords = sentence.split(" "); //splits the sentence by words

        System.out.println("AllWords = " + Arrays.toString(allWords));
        System.out.println("How many word do I have in this sentence? : " + allWords.length );
        //GETTING THE LAST WORD
        System.out.println("Last word in this sentence is "+allWords[ allWords.length-1 ] );

        String sentence2 = "Everything is Awesome!!!";
        //split by letter "e"
        String [] splitBy_e_Arr = sentence2.split("e");
        System.out.println("Arrays.toString(splitBy_e_Arr) = " + Arrays.toString(splitBy_e_Arr));
        for ( String eachPieces : splitBy_e_Arr ){
            System.out.println("eachPieces = <" +eachPieces+">");
        }


        






    }
}
