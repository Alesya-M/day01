package day16;
import java.util.Scanner;
public class GiveMe5 {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        //System.out.println("GIVE ME FIVE!");
//        int userNumber = scan.nextInt();
//
//        if(userNumber!=5){
//
//            System.out.println("You did not give me five!");
//
//        }
        int userNumber= 0;
        while (userNumber != 5){

            System.out.println("GIVE ME FIVE!");
            userNumber = scan.nextInt();
        }

        System.out.println("End of the program");



    }
}
