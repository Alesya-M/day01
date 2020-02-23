package day21;

public class nameTaskBreak {
    public static void main(String[] args) {

        String name = "Alesya";

        for (int x = 0; x <name.length() ; x++) {

            char currentChar = name.charAt(x);

            if (currentChar=='s'){
                System.out.println("Found it!");
                break;
            }
            System.out.println( currentChar );

        }

    }
}
