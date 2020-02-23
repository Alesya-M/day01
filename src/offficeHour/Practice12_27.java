package offficeHour;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice12_27 {
    public static void main(String[] args) {

        System.out.println(convertKmToMl(10));
        System.out.println(convertGalToLitters(100));
        int[] array= {2,3,1,5};
        //System.out.println(DescOrder(array));

       calculate(5,7,"+");
    }

    public static void verify(int num){

        if (num%2==0 ){
            System.out.println(num+" is even");
            return;
        }
        System.out.println(num+" is odd number");
    }

    //TASK1 Write a method that can convert km to miles
    public static double convertKmToMl(double km){

        double miles=km * 0.612;
        return miles;
    }
    //TASK2 Gallons to litters

    public static double convertGalToLitters(double galons){

        double litters = galons * 3.75;
        return litters;
    }

    public static void DescOrder(int[] array){

        Arrays.sort(array);
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.println(array[i]);
        }

    }

    public static void calculate(int a, int b, String operators){

       if(operators.equals("-")){
           System.out.println(a-b);
       }else if (operators.equals("+"))
           System.out.println(a+b);
       else if(operators.equals("*"))
           System.out.println(a*b);
       else if(operators.equals("/"))
           System.out.println(a/b);
       else if(operators.equals("%"))
           System.out.println(a%b);
       else
           System.out.println("Invalid operator");
    }

    public static void calculate2(int a, int b, char operator){

        switch (operator){
            case '-':
                System.out.println(a-b);
                break;
            case'+':
                System.out.println(a+b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid operator");

        }
    }

    //public static void GradeCalculator()


}
