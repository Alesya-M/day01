package day21;

public class skippAll5srepeat {

    public static void main(String[] args) {

        for (int x = 1; x <=100 ; x++) {

            if(x%5==0) {
                System.out.println("skipping " +x);

                continue;

            }
            System.out.println(x);


        }
    }
}
