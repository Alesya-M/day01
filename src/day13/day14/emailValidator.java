package day13.day14;

public class emailValidator {

    public static void main(String[] args) {

        String password = "Ab_cd$efg";

        int charCount = password.length();
        boolean charec = password.contains(" ");



        //minmax

        if (!password.contains(" ") && (password.contains("$") || password.contains("_")) && (password.length()>=8 && password.length()<=16) && password.startsWith("Ab")){
            System.out.println("Valid Password!");

        }else {
            System.out.println("INVALID PASSWORD");

        }
    }
}




