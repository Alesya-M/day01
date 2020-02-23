package myOwnPractice;
import java.util.Scanner;

public class wageTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your hourly wage?");
        int hpy = 2080;
        double wage = scan.nextDouble();
        double yearlyWage = wage*2080;

        System.out.println("Your yearly wage is " + yearlyWage );

    }
}
