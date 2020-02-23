package day22;

public class MultiplicationTable {

    public static void main(String[] args) {

//        System.out.println("1 x 1 = " + 1*1);
//        System.out.println("1 x 2 = " + 1*2);
//        System.out.println("1 x 3 = " + 1*3);



        for (int tableNumber = 1; tableNumber <=10 ; tableNumber++) {

            System.out.println("Multiplication table of " + tableNumber);

            for (int x = 1; x <= 10 ; x++) {

                System.out.println(tableNumber+" x " + x + " = "  + tableNumber*x);


            }

        }

    }
}
