package day31;

public class voting {

    public static void main(String[] args) {

        checkEligibility(15);
        checkEligibility(56);
        checkEligibility(34);

        int yourAge = 12 ;
        checkEligibility(yourAge);
    }

    public static void checkEligibility(int age){

        //int age = 15;

        if (age > 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible");
        }
    }



}
