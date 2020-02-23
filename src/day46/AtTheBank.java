package day46;

public class AtTheBank {
    public static void main(String[] args) {

        CheckingAccount acc1 = new CheckingAccount("Gena", 12345, 150);
        acc1.deposit(100);
        System.out.println("acc1 = " + acc1);
        acc1.withdraw(500);
        System.out.println("acc1 = " + acc1);
    }
}
