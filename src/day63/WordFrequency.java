package day63;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {

        String str = "Fun Fun Fun JAVA JAVA is Ending Tomorrow. No it is never Ending";
        
        String [] allwords = str.split(" ");
        System.out.println("allwords.length = " + allwords.length);
        Map<String,Integer>wordFreMap = new HashMap<>();

        for(String curWord : allwords){

            if(wordFreMap.containsKey(curWord)==false ){

                wordFreMap.put(curWord,1);
            }else {
                //int newCount = wordFreMap.get(currentWord)+1
                wordFreMap.replace(curWord,wordFreMap.get(curWord)+1);
            }
        }
        System.out.println("wordFreMap = " + wordFreMap);
       
    }
}
