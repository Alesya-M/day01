package day18;

public class evenNumber {

    public static void main(String[] args) {

        for (int x = 0; x<100; x+=2){

            System.out.print( x + " " );

        }
        System.out.println();

        for(int x=0;  x<100; x+=3  ){

            System.out.print(x + " ");
        }

        System.out.println("--------even number----------");

        for(int i = 0; i<100; i++){

            if(i % 2==0){

                System.out.print(i + " ");
            }
            System.out.println("------------------");

            if(i%5==0 && i%3==0){

                System.out.println(i + " IS FIZZ BUZZ NUMBER");
            }

        }
    }
}
