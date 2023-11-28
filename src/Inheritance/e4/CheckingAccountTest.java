package Inheritance.e4;
class BankAccount{
    public double balance;
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
        return this.balance;
    }
}
class CheckingAccount extends BankAccount{
    private int overdraftCount;
    private int monthlyOverdraftCount;
    public CheckingAccount(double initialBalance){
        super(initialBalance);
        overdraftCount = 0;
        monthlyOverdraftCount = 0;
    }
    @Override
    public void withdraw(double amount){
        if(amount > balance){
            if(overdraftCount == 0){
                balance -= amount;
                overdraftCount++;
                monthlyOverdraftCount++;
                balance -= 20;
            } else{
                balance -= amount;
                overdraftCount++;
                monthlyOverdraftCount++;
                balance -= 30;
            }
        } else{
            super.withdraw(amount);
        }
        monthlyOverdraftCount = 0;
    }
}
public class CheckingAccountTest {
    public static void main(String[] args) {
        BankAccount account = new CheckingAccount(100.00);
        System.out.println(account.getBalance());
        System.out.println("Expected: 100");

        account.withdraw(90.00);
        System.out.println(account.getBalance());
        System.out.println("Expected: 10");

        account.withdraw(20);
        System.out.println(account.getBalance());
        System.out.println("Expected: -30");

        account.withdraw(20);
        System.out.println(account.getBalance());
        System.out.println("Expected: -80");
    }
}
