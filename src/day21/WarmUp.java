package day21;

public class WarmUp {

    public static void main(String[] args) {


        String myName = "My name is Alesya here";

        int charCount = myName.length();
        int lastCharIndex= charCount - 1;


        for (int x = 0; x <= lastCharIndex; x++) {

            System.out.print(myName.charAt(x)+ ">");

        }



    }
}
