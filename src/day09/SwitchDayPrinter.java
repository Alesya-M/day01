package day09;

public class SwitchDayPrinter {

    public static void main(String[] args) {

        int dayCode = 3;

        switch (dayCode) {

            case 1 :
                System.out.println("Day is Monday");
                break; //use it to get out of this branch
            case 2 :
                System.out.println("Day is Tuesday");
                break;
            case  3 :
                System.out.println("Day is Wednesday");
                break;
            case 4 :
                System.out.println("Day is Thursday");
                break;
            case 5 :
                System.out.println("Day is Friday");
                break;
            default:
                System.out.println("Unknown day");

        }
    }
}
