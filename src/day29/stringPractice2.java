package day29;
import java.util.Arrays;
public class stringPractice2 {
    public static void main(String[] args) {

        String hero1 = "Superman-Clark Kent";
        String [] herpSplitted = hero1.split("-");
        System.out.println("herpSplitted = " + Arrays.toString(herpSplitted));
        String heroCode = herpSplitted[0];
        String fullName = herpSplitted[1];
        // LOGIC 1  :  get the first letter of full name
        //          then get first letter after the space
        //          concatenate them
        //          downside is what if we have middle name
        //          solution , instead of looking for the letter after first space
        //                      look for last index of the space then get next Character
        System.out.println("hero code is" +heroCode + "and identity is " +fullName);
        // LOGIC 2  : We already have full name stored in fullName variable
        //      split by space -->> we will get firstName (middle name) lastName
        //      get the first letter of full name
        //      then get the last name using last item index
        //      get the first character then concatenate
        //      Clark Kent -->> [  Clark , Kent ]   Clark->C   Kent-K  --->> CK
        String [] fullNameSplitted = fullName.split(" ");
        System.out.println(" full name Splittd" + Arrays.toString(fullNameSplitted));
        // last name will be always the last element of splitted full name
        // no matter the name has middle name or not
        String lastName = fullNameSplitted[fullNameSplitted.length-1];
        System.out.println("lastName = " + lastName);
        System.out.println("innitial of the hero is " +fullName.charAt(0)+lastName.charAt(0));
    }
}
