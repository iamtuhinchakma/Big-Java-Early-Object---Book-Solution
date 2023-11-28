package Inheritance.e3;
class BankAccount{
    private double balance;
    public BankAccount(){
        balance = 0;
    }
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }
    public double getBalance(){
        return balance;
    }
}
class BasicAccount extends BankAccount {
    public BasicAccount(double initialBalance){
        super(initialBalance);
    }
    public void withdraw(double amount){
        if(getBalance() - amount < 0){
            amount += 30;
        }
        super.withdraw(amount);
    }
}
public class BankAccountTest {
    public static void main(String[] args) {
       BankAccount account = new BasicAccount(100.00);
        System.out.println(account.getBalance());
        System.out.println("Expected balance: 100.00");

        account.withdraw(80);
        System.out.println(account.getBalance());
        account.withdraw(50);
        System.out.println(account.getBalance());
        System.out.println("Expected balance: -60");
    }
}

