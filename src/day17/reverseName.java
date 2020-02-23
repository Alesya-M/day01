package day17;
import java.util.Scanner;
public class reverseName {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = scan.nextLine();

        int x = name.length()-1;

        while(x>=0){

            System.out.println("index "+ x + " "+ name.charAt(x));
            --x;
        }


    }
}
