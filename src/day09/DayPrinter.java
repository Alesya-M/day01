package day09;

public class DayPrinter {

    public static void main(String[] args) {

        String dayOfTheWeek = ""; //Assigning an empty String

        int dayNumber = 5;


        if (dayNumber == 1) {

            dayOfTheWeek = "Monday";
        } else if (dayNumber == 2) {
            dayOfTheWeek = "Tuesday";
        } else if (dayNumber == 3) {
            dayOfTheWeek = "Wednesday";
        } else if (dayNumber == 4) {
            dayOfTheWeek = "Thursday";
        } else if (dayNumber == 5) {
            dayOfTheWeek = "Friday";

        } else if (dayNumber == 6) {
            dayOfTheWeek = "Saturday";
        } else if (dayNumber == 7) {
            dayOfTheWeek = "Sunday";
        } else {
            System.out.println("Unknown! ");
        }

        System.out.println("Today is " + dayOfTheWeek);
    }
}

