package day08.day08;
import java.util.Scanner;
public class ifStatement2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your current speed?");
        int currentSpeed = scan.nextInt();

        System.out.println("What is the speed limit?");
        int SpeedLimit = scan.nextInt();

        if (currentSpeed >= SpeedLimit ) {
            System.out.println("TICKET!");
        }

        System.out.println("MOVE ON!");




    }
}
