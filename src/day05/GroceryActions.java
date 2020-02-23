package day05;
import java.util.Scanner;

public class GroceryActions {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("what is the price for potato?");
        float potatoPrice =scan.nextFloat();
        System.out.println("How many are you buying?");
        int potatoCount = scan.nextInt();

        System.out.println("You total is " + (potatoPrice * potatoCount) );

    }
}
