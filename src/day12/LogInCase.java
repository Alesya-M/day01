package day12;

public class LogInCase {


        public static void main(String[] args) {

            String userName="user123" , password ="pass123";

            if(userName.equals("user123")&&password.equals("pass123")){
                System.out.println("Log in succesful");
            }else if(!userName.equals("user123") && password.equals("pass123")){
                System.out.println("Wrong username!");
            }else if(!password.equals("pass123") && userName.equals("user123")){
                System.out.println("Wrong password!");
            }else{
                System.out.println("Wrong password and username!");
            }
        }

}
