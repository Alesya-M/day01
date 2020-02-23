package day18;

public class DoWhileAtLeastRubOnce {

    public static void main(String[] args) {

        int x = 1000 ;

        do {
            System.out.println("Keep going");

        } while (x<5);//If its not true you get out of the LOOP! It keeps going while its true!

        System.out.println("The end!");

        while(x<5){

            System.out.println("Keep going in while");

        }

    }
}
