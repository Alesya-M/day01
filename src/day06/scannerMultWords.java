package day06;
import java.util.Scanner;
public class scannerMultWords {
    public static void main(String[] args) {

        Scanner blabla = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name =blabla.nextLine();
        System.out.println("You have entered " + name);

        System.out.println("Which city do you live in?");
        String city =blabla.nextLine();
        System.out.println("You are from " + city);

        System.out.println("What is you street address?");
        String address = blabla.nextLine();
        System.out.println("Your address is " + address);


    }
}
