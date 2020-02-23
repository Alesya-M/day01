package day09;
import java.util.Scanner;

public class WarmUp3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        String drinkingAge;

        System.out.println("What is your age?");
        int age = scan.nextInt();

        if (age >= 21 ){
            drinkingAge = " above 21 ";

        } else {
            drinkingAge = " underage ";

        }

        System.out.println("You are " + age + " and you are " + drinkingAge + "!" );
    }
}
