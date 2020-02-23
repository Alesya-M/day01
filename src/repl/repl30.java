package repl;
import  java.util.Scanner;
public class repl30 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String report="";

        double price1;
        double price2;
        double price3;
        double totalPrice=0;

        int count1;
        int count2;
        int count3;

        System.out.println("Enter Item1, count and its price:");
        String item1= scan.next();
        count1=scan.nextInt();
        price1=scan.nextDouble();

        System.out.println("Enter Item2, count and its price:");
        String item2= scan.next();
        count2=scan.nextInt();
        price2=scan.nextDouble();

        System.out.println("Enter Item3, count and its price:");
        String item3= scan.next();
        count3=scan.nextInt();
        price3=scan.nextDouble();


        if(count2==0 && count3!=0){
            price1=count1*price1;
            price3=count3*price3;
            totalPrice=price1+price3;
            report= "Item1: "+ item1+" Price: "+price1+", Item3: "+item3+ " Price: "+price3;
        }else if(count3==0 && count2!=0){
            price1=count1*price1;
            price2=count2*price2;
            totalPrice=price1+price2;
            report= "Item1: "+ item1+" Price: "+price1+", Item2: "+item2+" Price: "+price2;
        }else if(count3==0 && count2==0){
            price1=price1*count1;
            totalPrice=price1;
            report= "Item1: "+ item1+" Price: "+price1;
        }
        System.out.println(report);
        System.out.println("Total price: "+totalPrice);






    }
}
