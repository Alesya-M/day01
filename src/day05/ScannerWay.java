package day05;

import java.util.Scanner;

public class ScannerWay {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("What is your name?");
       // System.out.println();
        String name = scan.next();
        System.out.println("Your name is " + name );
        //My Questions1

        System.out.println("What year were you born?");
        int year = scan.nextInt();
        System.out.println("You were born in " + year );
        int bornYear = year;
        int currentYear = 2019;
        int yourAge = currentYear - bornYear;
        System.out.println("You are " + yourAge + " and you are ancient!");

        System.out.println("What is your height?");
        double height = scan.nextDouble();
        System.out.println("Your height is " + height + " HA HAHAHA! Stop it!");

        //My Questions2







    }
}
