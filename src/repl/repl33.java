package repl;
import java.util.Scanner;
public class repl33 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter number of milligrams in drink:");
        int drink=scan.nextInt();
        System.out.println("It would take about "+1000*10/drink+" drinks for a lethal overdose.");

    }
}
