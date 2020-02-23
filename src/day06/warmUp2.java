package day06;
import java.util.Scanner;

public class warmUp2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double regPrice;
        double salePrice;
        double discount;

        System.out.println("What is the regular price of this car?");
        regPrice = scan.nextDouble();

        System.out.println("What is the discount percent?");
        discount = scan.nextDouble();

        // salePrice = regPrice - regPrice * discount ;
        salePrice = regPrice - (discount * regPrice/100);

        System.out.println("Regular price is " + regPrice + " $ discounted price is " + salePrice + " $");

    }
}
