package offficeHour.Encapsulation;

public class TestUser {
    public static void main(String[] args) {

        UserInfo Alesya = new UserInfo();
//        System.out.println(Alesya.userName); Private is not accessible outside of the class.
//        Alesya.userName = "Alesya"; cannot assign the value without SETTER METHOD
//
      System.out.println(Alesya.getuserName());
      Alesya.setUserName("Alesya");
        System.out.println(Alesya.getuserName());;
    }
}
