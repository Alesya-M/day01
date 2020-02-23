package day43;

public class StarbuckUtil {
    public static void main(String[] args) {

        //create a static method to accept a coffe object and print it's information
        //like this: This coffee is: name, price is <price>, caffeine level is <level>
        Coffee c = new Coffee("Blonde", 5, 1.6);
        printCiffeInfo(c);

        Coffee c1 = new Coffee();
        printCiffeInfo(c1);
        printCiffeInfo(new Coffee("Intensitto",6));

        String myString = new String("Hello");
        printStringInfo(myString);

        //we would need an object of current class if we wanted to call
        //instance method of current class

//        StarbuckUtil util = new StarbuckUtil();
//        util.printStringInfo(myString);



    }

    public static void printCiffeInfo(Coffee co){

        System.out.println("This coffee is: "+ co.getType());
        System.out.println("Price is :"+ co.getPrice());
        System.out.println("CaffeineLevel is : "+ co.getCaffeineLevel());

    }

    public static void printStringInfo(String str){

        System.out.println("first character is " + str.charAt(0));
        System.out.println("last character is " + str.charAt(str.length()-1));
    }
}
