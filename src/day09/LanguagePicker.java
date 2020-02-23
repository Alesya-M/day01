package day09;

public class LanguagePicker {

    public static void main(String[] args) {

        System.out.println("Welcome to Cybertek Call Center");
        System.out.println("Please select your language option from 1-7");

        int languageOption = 1;
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
            greeting = "Unknown";

        }
        System.out.println("This is how the greeting message you get : " + greeting);
    }
}
