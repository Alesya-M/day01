package day05;

public class VariablePractice {

    public static void main(String[] args) {

        //int birthYear = 2001;
        //int currentYear = 2019;
        //int age = currentYear - birthYear;

        //System.out.println("I was born in year" +2001+ ", and I am" + (2019-2001) + "years old");
       // System.out.println("I was born in year " + birthYear + " , and I am " + age + " years old");

        int speedLimit = 55;
        int yourSpeed = 65;
        int exceedingSpeed = yourSpeed - speedLimit ;

        System.out.println("The speed limit is " + speedLimit + " mph you are exceeding your speed by " + exceedingSpeed + " Mph");
        int splimit = 150;
        int curspeed = 80;
        int underTheLimit = splimit - curspeed ;

        System.out.println("You are driving " + curspeed + " mph under the speed limit, the speed limit is "+ splimit + " mph");
    }
}
