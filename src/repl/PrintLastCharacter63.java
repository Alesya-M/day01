package repl;
import java.util.Scanner;
public class PrintLastCharacter63 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String word= scan.next();
        int firstChar=0;


        for (int x = firstChar; x >=0 ; x--) {

            firstChar = x;

        }
        System.out.println(word.charAt(firstChar));
    }


}
