package day17;

public class namPrinterLoop {

    public static void main(String[] args) {

        String name = "Alesya Malysheva" ;

        int x = 0 ;

        while (x <name.length() ) { // (x<=name.length()-1)
            // The loop goes until its false

            System.out.print("index " +x + " : ");
            System.out.println(name.charAt(x));
            ++x ;

        }




    }
}
