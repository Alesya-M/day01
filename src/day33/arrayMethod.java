package day33;

import static day33.methodReturnNumber.daysOfTheWeek;

public class arrayMethod {

    public static void main(String[] args) {
        int [] allCodes ={5,4,11,4,33};

        for (int x = 0; x <allCodes.length ; x++) {

            String day = anotherVersion(allCodes[x]);
            System.out.println("day = "+ day);

        }
        System.out.println("-----------");
        for (int eachCode : allCodes) {
            System.out.println("each day = "+ anotherVersion(eachCode));

        }

        System.out.println(daysOfTheWeek(7));
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
}
