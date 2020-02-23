package day08.day08;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class WarmUpTask {

    public static void main(String[] args) {

        int age = 15 ;
        System.out.println("Age is " + age);

        if (age >= 18) {
            System.out.println("You can vote! ");
        }else {
            System.out.println("Sorry, you cannot vote!");
        }


        Scanner scan = new Scanner(System.in);

        System.out.println("What is my Favorite number?");

        int MyFavoriteNumber= scan.nextInt();


        if ( MyFavoriteNumber == 50 ) {

            System.out.println("You win");
        } else {
            System.out.println("You loose!");
        }
    }


}


