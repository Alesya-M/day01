package day63;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindingCharacter {
    public static void main(String[] args) {

        String str = "The new link for joining class will require you to login Okta, if it ask you to sign in"+
                ", please just click on it, it will make you to Okta signing page, once you signing with Okta "+
                "Then you will be able to join right away. Please do not try to register, the link is already in the email"+
                "Click to join";

        //Set<Character>chars= new HashSet<>(Arrays.asList(new Character[]{'A','A','A','A','A'}));
        String[] eachCharArray = str.split("");
        System.out.println("Arrays.toString(eachCharArray) = " + Arrays.toString(eachCharArray));
        List<String> charLst = Arrays.asList(eachCharArray);
        
        Set<String>charSet = new HashSet<>(charLst);
        System.out.println("charSet = " + charSet);
        
        
    }
}
