package day20;

public class ReversingAString {

    public static void main(String[] args) {
        //             01234567
        String name = "Alesya Malysheva";
        String reversedName="";

        int lastCharIndex= name.length()-1;

        for (int x = lastCharIndex; x >=0; x--) {

            System.out.print(x + "index: ");
            char currentChar = name.charAt(x);
            System.out.println(currentChar);

            reversedName=reversedName+name.charAt(x);


        }
        System.out.println("Reversed name: "+reversedName);
    }
}
