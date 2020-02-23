package day39;

public class AtTheBank {

    public static void main(String[] args) {

        bankAccount b1 = new bankAccount();
        b1.setAllTheValue("Saving","Alesya", 12345678, 100000);
        b1.showAccountBalance();
        b1.showAccountHolderAccountType();
        b1.deposit(5000);
        System.out.println("b1 = "+ b1);
        b1.withdraw100$Cash();
        System.out.println(b1);
    }
}
