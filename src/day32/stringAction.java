package day32;

public class stringAction {

    public static void main(String[] args) {

        reverseMyOwnName();
       dashName("Kolya");
       dashName("Alesya");
       dashName("Gena");


    }

    public static void dashName(String name){

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            if(i ==name.length()-1){

                break;
            }
            System.out.print("-");

        }
        System.out.println();
    }

    public static void reverseMyOwnName(){
        String name = "Akbar";

        for (int x =name.length()-1 ; x >=0 ; x--) {

            System.out.print(name.charAt(x)+"-");

        }
        System.out.println();
    }
}
