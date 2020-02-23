package day46;

public class BankAccount {
    String accountHolder;
    long accountNum;
    double balance;

    public BankAccount(){

    }

    public BankAccount(String accountHolder, long accountNum, double balance) {
        //super();
        this.accountHolder = accountHolder;
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public void deposit(int amount){
        this.balance +=amount;
    }

    public void withdraw(int amount){
        balance -= amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }
}
