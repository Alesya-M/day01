package day13.day14;

public class Warm_up_AmazonShippingCalculator {

    public static void main(String[] args) {

        String memberType = "Prime member ";
        double amount = 15.99d;
        int shippingFee = 0;

        //First check if it is prime member or not

        if (memberType.equalsIgnoreCase("Prime member")) {


            System.out.println("1 day free shipping!");
            System.out.println("your final price is " + amount);
        } else if (!memberType.equalsIgnoreCase("Prime member ") && amount > 25) {

            //else  if(amount > 25 ) {

            System.out.println("Not a prime member but your order is over 25$");
            System.out.println("You got free shipping on amount of " + amount);

        } else {

            System.out.println("Sign up for prime membership?");
            shippingFee = 5;
            amount = amount + shippingFee;
            System.out.println("Your final amount is " + amount);

        }
    }
}

