package day34;

public class loginActivity {
    public static void main(String[] args) {

        verifyVoid("user","abc123");
       // boolean result2= verifyVoid("user","abc123");
        boolean result = verify("user","pass122");
        System.out.println(result);
        System.out.println(verify("urer","abc123"));
    }

    public static void verifyVoid(String user,String passw){
        if (user.equals("user")&& passw.equals("abc123")){
            System.out.println("Login successfull");
        }else{
            System.out.println("Login failed");
        }
    }

    public static boolean verify(String user,String passw){

        if(user.equals("user")&& passw.equals("abc123")){
            return true;
        }else {
            return false;
        }
    }

    public static boolean verify2(String user,String passw){


        return user.equals("user")&& passw.equals("abc123");


    }
}
