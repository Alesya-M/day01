package repl;
import java.util.Scanner;
public class repl109A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }
//        String word1=arr[0];
//        String word2=arr[1];
//        String word3=arr[2];
//        String word4=arr[3];
//        String word5=arr[5];
        for (int x = 0; x <=arr.length-1 ; x++) {
            String word =arr[x];

            System.out.println(word.substring(0,3));

        }

    }
}
