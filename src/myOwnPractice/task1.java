package myOwnPractice;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many days you worked this week?");
        int days = scan.nextInt();
        int hours = 24;
        int min = days*8*60;
        int h = days*8;

        System.out.println("You worked " + h + " hours or " + min + " minutes.");

    }
}
