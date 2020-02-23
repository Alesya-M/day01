package day34;

import java.lang.reflect.Array;

public class StringToIntegerParsing {
    public static void main(String[] args) {

        //Integer

        String strNum= "100";
        int num = Integer.parseInt(strNum);
        System.out.println(num);

        String str= "FB-100";
        //int num2=Integer.parseInt(str.split(" ")[1]);
        String[] empIDSplit= str.split("-");
       String idStr= empIDSplit[1];
       int id = Integer.parseInt(idStr);
        System.out.println("id = " + id);


        //String twoNumbers="100,600";


        String twoNumbers = "100,600";
        //String two = twoNumbers.split(",")[0];
        int sum = Integer.parseInt(twoNumbers.split(",")[0]) + Integer.parseInt(twoNumbers.split(",")[1]);
        System.out.println(sum);

        String num1="500";
        String num2="500";

        int numb1=Integer.parseInt(num1);
        int numb2=Integer.parseInt(num2);

        System.out.println("Sum is = "+(numb1+numb2));



        

    }
}
