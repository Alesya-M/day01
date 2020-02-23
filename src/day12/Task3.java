package day12;

public class Task3 {

    public static void main(String[] args) {

        int num = 77;

        if(num%5==0){
            System.out.println("FIZZ NUMBER!");
        }else if(num%3==3){
            System.out.println("BUZZ NUMBER");
        }else if (num%5==0 && num%3==0){
            System.out.println("FIZZ NUMBER");
        }else{
            System.out.println("NOT MY NUMBER!");
        }



    }
}
