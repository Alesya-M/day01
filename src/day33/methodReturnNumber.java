package day33;

public class methodReturnNumber {
    public static void main(String[] args) {
        System.out.println(dayCode(6));
        System.out.println(daysOfTheWeek(5));
    }

    public static String dayCode(int x) {
        if (x == 1) {
            return "Monday";
        } else if (x == 2) {
            return "Tuesday";
        } else if (x == 3) {
            return "Wednesday";
        } else if (x == 4) {
            return "Thursday";
        } else if (x == 5) {
            return "Friday";
        } else if (x == 6) {
            return "Saturday";
        } else if (x == 7) {
            return "Sunday";
        } else
           return "Funday";


    }

    public static String daysOfTheWeek(int dayCode) {
        String dayName=" ";
        switch (dayCode){
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:

                dayName="Funday";
                break;




        }
        return dayName;
    }



    public static String anotherVersion(int dayCode) {

        switch (dayCode){
            case 1:
                return "Monday";
            case 2:
                return"Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return"Funday";
        }
    }
/*
System.out.println(covertNumberToDay(3));  //   Wednesday
        System.out.println(covertNumberToDay(6));  //   Saturday
    }
    public static String covertNumberToDay(int dayNumber) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if(dayNumber<1 || dayNumber>7){
            return "Funday";
        } else {
            return days[ dayNumber-1 ];
        } }}


 */



}
