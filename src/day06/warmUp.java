package day06;
import java.util.Scanner;

public class warmUp {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

        System.out.println("What is the price of this item?");
     double regPrice = scan.nextDouble();
     double discount = 0.2;
     double salePrice = regPrice - (regPrice*discount);

        System.out.println("The price with discount would be " + salePrice + " dollars." );


    }
}
