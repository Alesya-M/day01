package repl;
import java.util.Scanner;
public class repl64 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        String word= scan.next();
        int lastChar=0;


        for (int x = lastChar; x < word.length(); x++) {
            lastChar=x;

        }
        System.out.println(word.charAt(lastChar));





    }


}
