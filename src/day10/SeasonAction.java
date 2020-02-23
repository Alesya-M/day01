package day10;

public class SeasonAction {

    public static void main(String[] args) {


        String season = "Fall";

        switch (season){

            case "Fall":
                System.out.println("Its Fall : Halloween!");
                break;

            case "Winter":
                System.out.println("Its Winter : New Year!");
                break;

            case "Spring":
                System.out.println("Its Spring : hike!");
                break;

            case "Summer":
                System.out.println("Its Summer : Vacation!");
                break;
            default:
                System.out.println("Wrong entry!");
                break;
        }


    }
}
