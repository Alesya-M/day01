package day06;
import java.util.Scanner;

public class taskRemaider {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many minutes did you code today?");
        int min = scan.nextInt();
        int hours = min/60;
        int remainder = min%60;
        System.out.println("You coded " + hours+ " hours and " + remainder+ " minutes");

    }
}
