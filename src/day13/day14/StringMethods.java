package day13.day14;

public class StringMethods {

    public static void main(String[] args) {

        //String actions we know:
        //equals, equalsIgnoreCase

        String s1 = "Hello";
        System.out.println( s1.equals("abc") );
        System.out.println( s1.equalsIgnoreCase("HELLO"));

        //toUpperCase method of String is used to make String all character uppercase


        System.out.println( s1);
        System.out.println( s1.toUpperCase()); //Calling a method of the String "." "()".


        //toLowerCase method of String is used to make all characters lowercase

        System.out.println( s1.toLowerCase() );


    }
}
