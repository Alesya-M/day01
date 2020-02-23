package day21;

public class findingTwoCharacters {

    public static void main(String[] args) {


        String myName = "Amelia Israfil Hajitev Mehmet Amelia Israfil Hajitev Behlia Mehmet";

        int charCount = myName.length();
        System.out.println("charCount = "+charCount);
        int lastCharIndex= charCount - 1;
        System.out.println("lastCharIndex = "+ lastCharIndex);
        for (int x = 0; x <= lastCharIndex-2; x++) {
            //OR! for (int x = 0; x <= charCount-2; x++)
            String current2Char= myName.substring(x , x + 3);
           if(current2Char.equalsIgnoreCase("lia")){

               System.out.println("The index of 'lia' is " + x );
           }

        }
    }
}
