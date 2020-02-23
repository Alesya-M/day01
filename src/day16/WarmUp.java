package day16;
import java.util.Scanner;
public class WarmUp {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter 4 letters word, please");

        String word1 = scan.nextLine();
        String word2 = (word1.charAt(3)+" "+word1.charAt(2)+" "+ word1.charAt(1)+ " "+ word1.charAt(0)+ " ");

        System.out.println(word2);


    }
}
