package day31;

public class calculV2 {
    public static void main(String[] args) {

        char operator= '+'; //it can be +-*/
        int num1=10;
        int num2=3;


    }

    public static void calculate(int num1, int num2, char operator){
        switch (operator){
            case '+':
                System.out.println("Addition result is "+ (num1+num2) );
                break;
            case '-':
                System.out.println("Substraction result is "+ (num1-num2) );
                break;
            case '*':
                System.out.println("Multiplication result is "+ (num1*num2) );
                break;
            case '/':
                System.out.println("Division result is "+ (num1/num2) );
                break;
            default:
                System.out.println("INVALID OPERATOR");


        }
    }




}
