package repl;
import java.util.Scanner;
public class repl35 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();

        int smartphone = 300;
        int laptop= 400;
        int charger=15;
        int usbCable=10;
        int headphones=30;
        int pants=50;
        int hat=25;
        int socks=5;
        int blanket=60;
        int pillow=40;

        int giftCard=100;

        if(item.equals("Smartphone")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if(item.equals("Laptop")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if(item.equals("Charger")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(giftCard-charger)+"$");
        }else if(item.equals("USB cable")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(giftCard-usbCable)+"$");
        }else if(item.equals("Headphones")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard - headphones) + "$");
        }else if(item.equals("Pants")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard - pants) + "$");
        }else if(item.equals("Hat")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard - hat) + "$");
        }else if(item.equals("Socks")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard - socks) + "$");
        }else if(item.equals("Blanket")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard - blanket) + "$");
        }else if(item.equals("Pillow")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard - pillow) + "$");
        }else{
            System.out.println("Invalid item!");
        }


    }
}
