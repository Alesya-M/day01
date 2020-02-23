package day63;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "AAABBBACCRDD";

        Map<Character, Integer> charFreq = new HashMap<>();

        for (int x = 0; x < str.length(); x++) {

            char currentChar = str.charAt(x);

            if(! charFreq.containsKey(str.charAt(x))){
                System.out.println("Enter for the first time "+ currentChar);
                charFreq.put(str.charAt(x),1);
            }else {
                System.out.println("Incrementing the count of "+currentChar+ " by one and "+"replacing old count "+charFreq.get(currentChar));
                charFreq.replace(currentChar, charFreq.get(currentChar)+1 );

            }
        }
        System.out.println("charFreq = " + charFreq);




    }
}
