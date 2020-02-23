package day10;
import java.util.Scanner;
public class StringSwitch2 {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("What vitamins are you taking?");
        String vitamin =scan.nextLine();

        switch(vitamin){

            case "Vitamin A":
                System.out.println("You are taking vitamin A.");
                break;
            case "Vitamin B":
                System.out.println("You are taking vitamin B" );
                break;
            case "Vitamin C":
                System.out.println("You are taking vitamin C");
                break;
            case "Vitamin D":
                System.out.println("You are taking vitamin D");
                break;

            default:
                System.out.println("You need to go to the Pharmacy");
                break;

        }


    }
}
