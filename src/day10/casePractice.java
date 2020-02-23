package day10;

public class casePractice {

    public static void main(String[] args) {


        String order = "";
        int itemNumber = 35;

        switch (itemNumber) {

            case 11:
                System.out.println("You have selected unknown item");
                order = "Unknown";
                break;
            case 5:
                System.out.println("You have selected 5");
                order = "Burger";
                break;
            case 8 :
                System.out.println("You have selected 8");
                order = "French Fry" ;
                break;
            case 35 :
                System.out.println("You have selected 35");
                order = "Ice Cream" ;
                break;
            default:
                System.out.println("Unknown item");
                break;

        }

        System.out.println("You order is " + order);
    }
}