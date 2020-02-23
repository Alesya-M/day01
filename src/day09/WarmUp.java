package day09;
import java.util.Scanner;
public class WarmUp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Pick a number");

        int yourNumber = scan.nextInt();

        int Number = yourNumber%2;

        if (Number == 1) {

            System.out.println("This number is odd");


        } else {
            System.out.println("This number is even");
        }




    }
}
