package day18;

import java.util.Scanner;

public class countingBills {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Give me 5 or 20:");

        int x = scan.nextInt();
             // !(x== || x==20)
        while( ! (x==5 || x==20)  ){

            System.out.println("Not the bill I need!");
            System.out.println("Give me 5$ or 20$");
            x=scan.nextInt();
        }

        System.out.println("Got the money!");

    }
}
