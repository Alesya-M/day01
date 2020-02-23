package day06;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your order? I want the same!");
        String myOrder = input.nextLine();
        String yourOrders = myOrder;
        // "\n"

        System.out.println(" Your order is " + yourOrders + "\n" + " My order is " + myOrder);



    }
}
