package day32;

public class methodWithReturn {
    public static void main(String[] args) {

    String name = giveMyName();
        System.out.println("name= "+name);

        int myResult= doubleTheNumber(10);
        System.out.println("myResult = " + myResult);
        System.out.println("--------");
       int iii= doubleTheNumber(2);
        System.out.println(iii);
        System.out.println("--------");
        System.out.println("*"+doubleTheNumber(5)+"*");
        doubleTheNumber(6);
        System.out.println(doubleTheNumber(15));

        System.out.println( "result of doubling of 100 is "+ doubleTheNumber(100)   );


        int add14to16Result = add2Numbers(14,16);
        System.out.println("add14to16Result = " + add14to16Result);
        System.out.println(add2Numbers(5,99));
        System.out.println(add2Numbers(5,5)+1);



    }

    public static int doubleTheNumber(int num){
        //System.out.println("I am goint to double the value of " + num);
        int result = num*2;
        return result;
    }


    public static String giveMyName(){
        //assume getting my name is multi step complex operation
        return "Akbar";
    }

    ///.create a method called add, accept 2 int parameter
    //and return the result as int
    public static int add2Numbers( int num1, int num2  ){

        return num1+num2;
    }



}
