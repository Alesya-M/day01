package day17;

public class WhileLoopPractice {

    public static void main(String[] args) {

        int counter = 1;

        while(counter<=5){

            System.out.print(counter+ " ");
            counter++;
        }
        System.out.println();
        System.out.println("Counter value is " + counter);

        while (counter>1){

            counter--;
            System.out.print(counter+ " ");

        }

        System.out.println();
        System.out.println("Current counter value after decrement= "+ counter);


    }
}
