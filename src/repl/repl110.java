package repl;
import java.util.Scanner;
public class repl110 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        for (int x = 0; x < words.length; x++) {
            String word=words[x];
            int chaRR= word.length()-1;

            System.out.println(word.charAt(0)+""+word.charAt(chaRR) );

        }

    }
}
