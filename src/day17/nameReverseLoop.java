package day17;

public class nameReverseLoop {

    public static void main(String[] args) {

        String name = "Alesya Malysheva";

        int x = name.length()-1 ;

        while(x>=0){

            System.out.println("index " + x + " : " + name.charAt(x));

            --x;
        }

    }
}
