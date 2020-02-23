package day46;

import java.sql.Savepoint;

public class savingAccount extends BankAccount {


    double interestRate;

    public savingAccount(String accountHolder,long accountNum,double balance,double interestRate){

        super(accountHolder, accountNum, balance);
        this.interestRate = interestRate;
    }


    public static void main(String[] args) {

        savingAccount s1 = new savingAccount("Alesya", 12345, 80000, 4.2);
        System.out.println("s1 = " + s1);
        s1.deposit(100550);
        System.out.println("s1 = " + s1);
    }

    
    @Override
    public void withdraw(int amount){
        balance -= amount - 30;
    }
    public void deposit(int amount){
       //balance += amount + amount*interestRate;
        int actualAmount = (int)(amount + amount*interestRate);
        super.deposit(actualAmount);
       
    }





    @Override
    public String toString() {
        return "savingAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }
}
