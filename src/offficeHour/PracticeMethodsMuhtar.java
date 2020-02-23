package offficeHour;

public class PracticeMethodsMuhtar {


    public static void main(String[] args) {

        String a="ABCDEFG";
        for (int i = a.length()-1; i >=0 ; i--) {
            System.out.println(a.substring(i,i+1));
        }

        String a1 = "Alesya Malysheva";
        method2();
       double number1= method3();


        float num1 = 10.5f;
        double num2 = num1;
        System.out.println(eligibile(10));
        System.out.println(eligibile(36));

    }


    public static void method1(){
        System.out.println("Hello");
    }

    public static void method2(){
        if (false){
            return;//exists the current method
        }
        System.out.println("Test completed");
    }

    public static double method3(){
        return 10.0f;
    }

    public static boolean eligibile(int age){

        if(age>35){
            return true;
        }
        return false;
    }

}
