package day37;
import java.util.*;
public class task2 {
    /**
     * Given List of names with various character count,
     * Remove any name with less than 2 characters
     * and if any name has more than 10 character only keep 10 characters
     * and if it has exactly 5 characters , reverse it
     * Of course , Otionally make a method out of it.
     */
    public static void main(String[] args) {

        System.out.println(nameCharsToList("Alesya"));

        List<Character> resultList = nameCharsToList("Kolya");
        resultList.add('A');
        System.out.println("resultList = " + resultList);
    }
    public static List<Character>nameCharsToList(String name){
        List<Character>charLst = new ArrayList<>();

        for (int i = 0; i < name.length(); i++) {
            charLst.add(name.charAt(i));

        }

        return charLst;
    }
}
