package day31;

public class seasonChecker {
    public static void main(String[] args) {

        String season = "DDD";
        decideSeason("Winter");
        decideSeason("Summer");
        decideSeason(season);

    }

    public static void decideSeason(String season){

        switch (season){

            case "Spring":
                System.out.println("Hiking");
                break;
            case"Summer":
                System.out.println("Swimming");
                break;
            case"Fall":
                System.out.println("Pumpkin picking");
                break;
            case "Winter":
                System.out.println("Go Snowboarding");
                break;
            default:
                System.out.println("Invalid season");
        }

    }

}
