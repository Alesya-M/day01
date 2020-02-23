package day08.day08;

public class IfStatement {

    public static void main(String[] args) {

        int speedLimit = 60 ;

        int yourCurrentSpeed = 100 ;

        //if (yourCurrentSpeed > 60 ) {
          //  System.out.println("You are getting a ticket!");
        //}else {
        //    System.out.println("Great job!");
       // }
        boolean amISpeading = (yourCurrentSpeed > speedLimit) ;
        //if(IamSpeading){
        // if(true) {
        //if (amISpeading==true) {
            if (yourCurrentSpeed > speedLimit){
            System.out.println("You are getting speed ticket John Florida!");
        } else {
            System.out.println("Good job!");
        }

        System.out.println("THE END");
    }
}
