package day21;

public class countOfSomething {

    public static void main(String[] args) {

        String myName = "CatHeadcatDogCat";
        int charCount = myName.length();
        int lastCharIndex = charCount-1;

        System.out.println("Character Count : "+charCount);
        System.out.println("Last Character Index : " +lastCharIndex);

        int counter = 0;

        for (int x = 0; x <=lastCharIndex-2 ; x++) {

            String current3Chars = myName.substring(x, x+3 );

            if (current3Chars.equalsIgnoreCase("cat")){

                System.out.println("The index of cat is " + x);
                counter++;
            }

        }
        System.out.println("Counter of cat is: " +counter);


    }



}
