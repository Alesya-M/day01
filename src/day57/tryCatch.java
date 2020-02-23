package day57;

public class tryCatch {
    public static void main(String[] args) {
        System.out.println("Hello before catch");
        try{

            int result = 10/0;

        }catch (ArithmeticException e){
            System.out.println("Exception happened, and it was caught and handles!");
        }


        System.out.println("Hello");

        try {
            System.out.println("in second try block");
            String str = "Java is fun";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(30));
            System.out.println(str.charAt(1));
        }catch(Exception e){
            System.out.println("Exception happened in try block and caught!");
        }
        System.out.println("After second try catch");
    }
}
