package day16;

public class SecondWordGetter {

    public static void main(String[] args) {

        //given a sentence with 3 words
        //get the second word

        //Second word is between first and last space
        //INDEX= the location, the position of the characters

                         //0123456789012345678
        String sentence = "You understand Java";
        String secondWord;
        int firstSpaceIndex= sentence.indexOf(" ");
        System.out.println("firstSpaceIndex = " + firstSpaceIndex);

        int lastSpaceIndex = sentence.lastIndexOf(" ");
        System.out.println("lastSpaceIndex = "+ lastSpaceIndex);

        System.out.println( sentence.substring(1+1,6));
        secondWord = sentence.substring(firstSpaceIndex+1 , lastSpaceIndex );
        System.out.println("secondWord = " +secondWord);
        
        //How to get the first word?
        //first word zero to first space
        
        String firstWord = sentence.substring(0,firstSpaceIndex);
        //how do we print out a variable with value using shortcute : soutv then TAB

        System.out.println("firstWord = " + firstWord);
        
        //Last word in a sentence means from the last space till the rest
        
        String lastWord = sentence.substring(lastSpaceIndex+1);
        System.out.println("lastWord = " + lastWord);



    }
}
