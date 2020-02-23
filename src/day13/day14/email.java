package day13.day14;

public class email {

    public static void main(String[] args) {

        String email = "sun@gmail.com";

        //boolean check1 = email.contains("@");
        //boolean check2 = !email.contains(" ");

        //if(email.endsWith("gmail.com")){
           // System.out.println("GMAIL");


        if (!email.contains("@") && !email.contains(" ") ){
            System.out.println("Invalid email!");

        }else if (email.endsWith("@gmail.com")){
            System.out.println("GOOGLE EMAIL");
        }else if(email.endsWith("@yahoo.com")){
            System.out.println("YaHOO");
        }else if(email.endsWith("@mail.ru")){

            System.out.println("Russian mail");

        }
    }
}
