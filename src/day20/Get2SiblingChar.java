package day20;

public class Get2SiblingChar {

    public static void main(String[] args) {

        String name = "Ayra";
        //Ay 01 -->> 02
        //yr 12 -->> 13
        //ra 23 -->> 24
        int charCount = name.length();
        int lastCharIndex = name.length()-1;

        System.out.println(name.substring(0,2));
        System.out.println(name.substring(1,3));
        System.out.println(name.substring(2,4));

        for (int x = 0; x <= lastCharIndex-1; x++) {

            System.out.println(name.substring(x,x+2));

        }
        System.out.println("Getting 3 characters");

        for (int x = 0; x <=lastCharIndex-2 ; x++) {

            System.out.println(name.substring(x, x+3));

        }

    }
}
