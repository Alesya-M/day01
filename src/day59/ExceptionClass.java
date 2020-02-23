package day59;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionClass {

    public static void main(String[] args) {


        System.out.println("The Start");
        String name = "Furkan";

        Scanner scan = new Scanner(System.in);
        System.out.println("Character at what index you want to get from Furkan's name?");
        try {
        int targetIndex= scan.nextInt();
        System.out.println( name.charAt(targetIndex));
            System.out.println("end of try");
        }catch (StringIndexOutOfBoundsException e) {

    //System.out.println("Message from getMessage method: "+ e.getMessage());
    System.out.println("Out of bound!");
            System.out.println("Enter number 0 to "+name.length());
}catch (InputMismatchException bla){
            System.out.println("Input mismatch, enter number!");
            System.out.println("If you enter 0 you will get "+name.charAt(0));
        }
        System.out.println("The End");

        //StringIndexOutOfBoundsException e1 = new StringIndexOutOfBoundsException();

    }
}
