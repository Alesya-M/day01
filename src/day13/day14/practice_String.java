package day13.day14;

public class practice_String {

    public static void main(String[] args) {

        String name = "Alesya";

        System.out.println(name.equals("alesya"));
        System.out.println("My name is Alesya and it is " + name.equalsIgnoreCase("ALESYA"));
        System.out.println("My name is in lower case: " + name.toLowerCase());
        System.out.println("My name is in upper case: " + name.toUpperCase());

        //LENGTH METHOD
        //Anything inside of the quotations counts as a character even space.
        System.out.println( name.length() );

        int lengthOfStr = name.length();

        if(lengthOfStr>4){
            System.out.println("More than 4 characters");
        }else {
            System.out.println("Less than 4 characters");
        }
    }
}
