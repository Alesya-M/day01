package day63;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindingUnique {
    public static void main(String[] args) {

        String str = "The new link for joining class will require you to login Okta, if it ask you to sign in"+
                ", please just click on it, it will make you to Okta signing page, once you signing with Okta "+
                "Then you will be able to join right away. Please do not try to register, the link is already in the email"+
                "Click to join";
       // String[]arrSt = str.replace(" ","").replace(",","").replace(".","").split("");
        Set<String> charList = new HashSet<>(Arrays.asList(str.replace(" ","").replace(",","").replace(".","").split("")));

        System.out.println("charList = " + charList);
        //How many unique character showed up in above sentence

        Set<Character>charSet = new HashSet<>();
        for (int x = 0; x < str.length(); x++) {
            charSet.add(str.charAt(x));
        }
        System.out.println("Count: "+str.length());
        System.out.println("Unique characters: "+charSet.size());
        System.out.println("charSet = " + charSet);

        for (Character eachChar: charSet){
            System.out.println("each Unique Char = " + eachChar);
        }
    }


}
