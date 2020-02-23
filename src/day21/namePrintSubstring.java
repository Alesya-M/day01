package day21;

public class namePrintSubstring {

    public static void main(String[] args) {


        String myName = "Alesya Malysheva";

        int charCount = myName.length();
        System.out.println("charCount = "+charCount);
        int lastCharIndex= charCount - 1;
        System.out.println("lastCharIndex = "+ lastCharIndex);

        for (int x = 0; x <= lastCharIndex;x++) {

            System.out.print(myName.substring(x , x+1) + ">");//Give me one more from the starting point
        }
        System.out.println();

        //PRINTING TWO CHARACTERS

        for (int x = 0; x <= lastCharIndex-1; x++) {
            //OR! for (int x = 0; x <= charCount-2; x++)

            String twoChar= myName.substring(x , x + 2);
            System.out.print(twoChar+"->");

        }
        //PRINTING THREE CHARACTERS
        System.out.println();

        for (int x = 0; x <= lastCharIndex-2; x++) {
            //OR! for (int x = 0; x <= charCount-3; x++)

            String threeChar= myName.substring( x , x+3);
            System.out.print(threeChar+"->");

        }



        }

    }
