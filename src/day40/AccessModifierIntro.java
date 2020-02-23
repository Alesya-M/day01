package day40;

import day39.bankAccount;

public class AccessModifierIntro {
    public static void main(String[] args) {

        bankAccount b1 = new bankAccount();
        b1.showAccountBalance();



        Person p1 = new Person();
//        p1.name = "Alesya";
//        p1.age = 30;
//        p1.ssn = 7698763;
        p1.setAll("Alesya",30, 43434343);
        System.out.println(p1);

        p1.setName("Emma");
        System.out.println(p1.getName());
        System.out.println(p1.toString());
        
        p1.setAge(21);
        p1.setSsn(49873983);
        
        int emmaAge = p1.getAge();
        System.out.println("emmaAge = " + emmaAge);
        
    }


}
