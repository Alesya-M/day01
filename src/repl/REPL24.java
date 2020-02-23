package repl;
import java.util.Scanner;
public class REPL24 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String firstName;
        String lastName;
        String email;
        String street;
        String state;
        String city;
        String address;
        String contacts;
        int age;
        int zipcode;
        double height;
        double weight;
        boolean isMarried;
        long workPhoneNumber;
        long personalPhoneNumber;

        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");

        System.out.println("Enter your first name");
        firstName=scan.nextLine();
        System.out.println("Enter your last name");
        lastName=scan.nextLine();
        System.out.println( "Enter your email");
        email=scan.nextLine();
        System.out.println("Enter your street");
        street=scan.nextLine();
        System.out.println( "Enter your city");
        city=scan.nextLine();
        System.out.println("Enter your state");
        state=scan.next();
        System.out.println("Enter your zip code");
        zipcode=scan.nextInt();
        System.out.println("Enter your work phone number");
        workPhoneNumber=scan.nextLong();
        System.out.println( "Enter your personal phone number");
        personalPhoneNumber=scan.nextLong();
        System.out.println("Enter your age");
        age=scan.nextInt();
        System.out.println( "Enter your height");
        height=scan.nextDouble();
        System.out.println("Enter your weight");
        weight=scan.nextDouble();
        System.out.println("Are you married?");
        isMarried=scan.nextBoolean();
        String fullName= firstName+", "+lastName;

        System.out.println("Patient personal information");
        System.out.println("Full name: "+fullName);
        System.out.println("Address: "+ street+", "+ city+ ", "+state+" "+zipcode);
        System.out.println("Contacts: work phone number - "+workPhoneNumber+", personal phone number - "+personalPhoneNumber+", email: "+email);
        System.out.println("Age: "+age);
        System.out.println("Height: "+ height);
        System.out.println("Weight: " +weight);
        System.out.println("Married?: "+isMarried);








        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();
        // continue for city
    }
}
