package day21;

public class searchingInString {

    public static void main(String[] args) {

        String myName = "Hasan Mammadov";

        int charCount = myName.length();
        System.out.println("charCount = "+charCount);
        int lastCharIndex= charCount - 1;
        System.out.println("lastCharIndex = "+ lastCharIndex);

        //Find out index of all the letter "a" in cases insensitive manner
        //go through and Check each and every letter of the STRING
        //                                    ---->> can use substring(0,1) and so on
        //                                    ---->> going to 0 to last index ----for loop
        //And while Im checking, i will check whether current character equal "a" or "A"
        //If it is I will print the index
        //If not I would move on
        //Perform this action until I reach last character if I go over the last character index I stop

        //

        for (int x = 0; x <= lastCharIndex;x++) {

            String currentChar = myName.substring(x, x+1);
            if(currentChar.equalsIgnoreCase("a")){

                System.out.println("The index of a or A is " + x );

            }







        }

    }
}
