package day32;

public class methodWithReturnPractice {
    public static void main(String[] args) {
        System.out.println("result of division: "+divide(0,7));


    }

    public static double divide(double num1, double num2){
        if (num2==0){
            return 0.0;
        }else{
            return num1/num2;
        }
    }
}
