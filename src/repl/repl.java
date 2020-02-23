package repl;
import java.util.Scanner;
public class repl {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int itemPrice;
        int quarters;
        int dimes;
        int nickels;

        System.out.println("Enter price in cents:");

        itemPrice=scan.nextInt();
        if(itemPrice%5==0 && itemPrice>=25 && itemPrice<=100 ){
            itemPrice= 100-itemPrice;

            quarters=itemPrice/25;
            itemPrice=itemPrice-(25*quarters);

            dimes=itemPrice/10;
            itemPrice=itemPrice-(10*dimes);

            nickels=itemPrice/5;
            itemPrice=itemPrice-(5*dimes);





            System.out.println("Your change is "+ quarters+" quarters,"+dimes+" dimes,"+" and "+nickels+" nickels.");

        }else if (  itemPrice%5!=0 || (itemPrice<25 || itemPrice>100)){

            System.out.println("Invalid price!");
        }



    }
}

