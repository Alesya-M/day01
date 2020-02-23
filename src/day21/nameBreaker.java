package day21;

public class nameBreaker {

    public static void main(String[] args) {


        String name = "Karamov Nikolay";

        for (int x = 0; x < name.length(); x++) {
            char currentChar =name.charAt(x);
            if (currentChar=='l' || currentChar=='L') {
                System.out.println("Found it!");
                break;
            }
            System.out.println(currentChar);
        }
    }
}
