package day10;

public class MultiBranch_Practice {

    public static void main(String[] args) {

        System.out.println("Welcome to McDonald, what can I get for you?");


        String order = "";
        int itemNumber = 11;

        if (itemNumber == 1) {
            System.out.println("You have  selected 1");
            order = "Burger";
        } else if (itemNumber == 5) {
            System.out.println("You have  selected 5");
            order = "French fry";
        } else if (itemNumber == 8) {
            System.out.println("You have  selected 8");
            order = "Nugetts";

        } else if (itemNumber == 35) {
            System.out.println("You have  selected 35");
            System.out.println("YAY!!");
            order = "Ice Cream";
        }else{
            System.out.println("You have selected unknown item");
            order = "Unknown" ;
        }

        System.out.println("Your order is " + order);
    }
}
