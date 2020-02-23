package day07;
import java.util.Scanner;

public class exercise {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name, last name, company separated by space : ");

        String name, lastname, company, email;
        name = scan.next(); //"Alesya";
        lastname = scan.next();  //"Malysheva";
        company = scan.next();  //"UPMC";
        email = name+"_"+lastname +"@"+ company + ".com";

        // "\t"- for space
        System.out.println("My name is " + name + "\t" + lastname + " and I work for " + company + " and my email is " + email);
    }
}
