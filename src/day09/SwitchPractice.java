package day09;

public class SwitchPractice {

    public static void main(String[] args) {

        String Language = "Sunday";
        switch (Language) {
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            default:
                System.out.println("Day is unknown");
        }
    }
}
