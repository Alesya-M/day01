package day12;

public class LoginTest_V2 {

    public static void main(String[] args) {

        String userName= "Alesya";
        boolean userNameCorrect = userName.equals("ALESYA");

        System.out.println( userNameCorrect);

        boolean nameCheckIgnoreCase = userName.equalsIgnoreCase("aLeSyA");

        System.out.println(nameCheckIgnoreCase);
    }
}
