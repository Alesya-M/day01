package day06;
import java.util.Scanner;

public class ScannerCapturingMultipleWords {

    public static void main(String[] args) {

        Scanner blabla = new Scanner(System.in);

        System.out.println("What is your name? ");

        String name = blabla.next();
        //String anotherWord =blabla.next();

        System.out.println("What is you age?");
        int age = blabla.nextInt();

        System.out.println("You have entered " + name);
        //System.out.println("Another word is " + anotherWord);
        System.out.println("You have entered age " + age);

    }
}
