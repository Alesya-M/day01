package day10;

public class Switch {

    public static void main(String[] args) {

        char operator = '/'; //REMEMBER CHAR I'', single quote.


        switch (operator){

            case '+':

                System.out.println("You are about to add numbers");
                break;

            case '-':
                System.out.println("You are about to subtract");
                break;

            case '*':

                System.out.println("You are about to multiple numbers");
                break;

            case '/':

                System.out.println("You are about to divide numbers");
                break;
            default:
                System.out.println("Error!");
                break;


        }


    }
}
