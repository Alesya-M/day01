package day09;

public class SwitchPractice2 {

    public static void main(String[] args) {

        System.out.println("Pick a language");

        int languageOption = 1;
        String greeting ="";

        switch (languageOption){

            case 1 :
                greeting = "Salam";
                break;

            case 2 :
                greeting = "Privet";
                break;

            case 3 :
                greeting = "Hola";
                break;

            case 4 :
                greeting = "Bonjour";
                break;
            case 5 :
                greeting = "Szia";
                break;

            case 6 :
                greeting = "Salam";
                break;
            default:
                greeting = "Unknown";

        }

        System.out.println("You language is " + greeting);
    }
}
