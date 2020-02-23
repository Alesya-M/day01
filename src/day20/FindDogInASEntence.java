package day20;

public class FindDogInASEntence {

    public static void main(String[] args) {

        //given a sentence find out the location of the dog.

        String msg = "I like Dog, Dogs are cute, Dogs are friendly";
        int lastCharIndex = msg.length()-1;

        for (int x = 0; x <=lastCharIndex ; x++) {


            String current3chars = msg.substring(x, x+3);
            System.out.println(x+ ":" + msg.substring(x, x+3 ));

            if(current3chars.equals("Dog")){

                System.out.println("Bingo! At "+ x);
            }

        }


    }
}
