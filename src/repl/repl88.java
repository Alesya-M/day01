package repl;
import java.util.Scanner;
public class repl88 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        if (word.contains("cat") && word.contains("dog")) {
            countOfCats++;
            countOfDogs++;

            System.out.println("true");


        }else{

            System.out.println("false");
        }
        System.out.println(word);

        String lan1 ="a";
        String lan2 = "n";


        System.out.println("I will learn");


    }
}

