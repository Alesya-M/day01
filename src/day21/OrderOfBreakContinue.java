package day21;

public class OrderOfBreakContinue {

    public static void main(String[] args) {

        for (int x = 1; x <=10 ; x++) {

            System.out.println(x);

            continue;
            //System.out.println("Hello");//unreachable code!!!!

        }
        System.out.println("The end");
    }
}
