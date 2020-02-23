package day09;


public class InitializingAVariable {

    public static void main(String[] args) {

        int languageOption = 4;
        String greeting = "";

        if (languageOption == 1) {
            greeting = " Hello";


        } else if (languageOption == 2) {
            greeting = " Salam";
        } else if (languageOption == 3) {
            greeting = " Hola";
        } else if (languageOption == 4) {
            greeting = " Bounjour";
        } else if (languageOption == 5) {
            greeting = " Szia";

        } else {
            System.out.println("^$%@!");
        }

        System.out.println(greeting + ", SDET! ");
    }
}
