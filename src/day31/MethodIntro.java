package day31;

public class MethodIntro {

    public static void main(String[] args) {

        //two ways to call static methods
        //ClassName.methodName(External data if needed)
        //if you are in same class
        //you can directly called them
        //methodName(External data if needed)
        MethodIntro.sayHello();
        sayHello();

        MethodIntro.calc();
        calc();



    }//Main method ends here!!!

    //Do not create a method inside main method
    public static void sayHello(){

        System.out.println("Hello World");
        System.out.println("My name is Alesya");
        System.out.println("I love Java");
    }

    public static void calc(){
        int num1 = 5;
        double num2 = 3.0d;
        float num3 = 3.0f;
        double result1 = num1 + num2;
        double result2 = num1 - num2;
        double result3 = num1 * num2;
        double result4 = num1 / num2;
        float result5 = num1 / num3;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }


}
