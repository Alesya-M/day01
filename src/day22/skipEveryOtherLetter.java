package day22;

public class skipEveryOtherLetter {

    public static void main(String[] args) {

        String msg = "I struggle with Java I love Java and Java is awesome!";
        int charCount= msg.length();
        System.out.println("Character Count = " +charCount);


        for (int x = 0; x <=charCount-1 ; x++) {
            //This is the code to skip odd number index letters
            if (x % 2 == 1) {
                continue;//this line will skip the rest and move to the next iteration
                 }
            //this is storing each character as String
            String currentChar = msg.substring(x, x + 1);

            //This is checking the currentChar is S or s
            if (currentChar.equalsIgnoreCase("s")) {
                break;//this will stop the loop
            }
            //printing out index and character at that index
            System.out.println(x + " index"+ " : currentChar = " + currentChar);

        }

            }


    }

