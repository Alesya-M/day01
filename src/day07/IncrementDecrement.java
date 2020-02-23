package day07;

public class IncrementDecrement {

    public static void main(String[] args) {


        int apple = 8;

        apple++ ;

        System.out.println(apple);
        //System.out.println(++apple);
        System.out.println(apple++);
        System.out.println(apple);

        int score= 50;
        System.out.println(++score);//51
        System.out.println(score++);//current value is still 51
        System.out.println(score); //52 is the current value
        System.out.println(--score);//51
        System.out.println(score--);//current value is still 51
        System.out.println(score);//value became 50 after Post decrement.
    }
}
