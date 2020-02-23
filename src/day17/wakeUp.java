package day17;
        import java.util.Scanner;
public class wakeUp {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name:");

        String name = scan.next();

        String name2= (name.substring(0,1)).toUpperCase()+ name.substring(1).toLowerCase();

        System.out.println(name2);

    }
}
