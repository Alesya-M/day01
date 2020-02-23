package day08.day08;

public class MultiBranchStatement {

    public static void main(String[] args) {

        //int speedLimit = 60 ;
        int currentSpeed = 90 ;

        if (currentSpeed>90) {
            System.out.println(" JAIL! ");
        } else if ( currentSpeed > 80 ) {
            System.out.println("RECKLESS DRIVING");
        } else if (currentSpeed > 70){
            System.out.println("POINT TAKEN!");
        } else if (currentSpeed > 60 ) {
            System.out.println("WARNING!");
        } else {
            System.out.println("KEEP DRIVING!");
        }

    }
}
