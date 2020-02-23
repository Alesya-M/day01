package day10;
import java.util.Scanner;
public class StringSwitch {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("What is you dick size?");
        String DickSize=scan.next();

        switch(DickSize){

            case "XSmall":
                System.out.println("Shit! My cat got sick I need to go!");
                break;
            case "Small":
                System.out.println("You are great but I don't want to ruin our friendship");
                break;
            case "Medium":
                System.out.println("Hi there!");
                break;
            case "Large":
                System.out.println("Whoa!");
                break;
            default:
                System.out.println("WATTA FUCK!");
                break;
        }

    }


}
