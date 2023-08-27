package problem_01;

public class RunnerCashRegister {
    public static void main (String[] args)
    {
        final Coin DOLLAR = new Coin(1.00, "Dollar");
        final Coin QUARTER = new Coin(0.25, "Quarter");
        final Coin DIME = new Coin(0.10, "Dime");
        final Coin NICKEL = new Coin(0.05, "Nickel");
        final Coin PENNY = new Coin(0.01, "Penny");

        CashRegister register = new CashRegister();

        register.recordPurchase(0.19);
        register.recordPurchase(2.95);
        register.recordPurchase(10.95);
        register.recordPurchase(0.70);

        register.receivePayment(12, DOLLAR);
        register.receivePayment(8, QUARTER);
        register.receivePayment(10, DIME);
        register.receivePayment(10, NICKEL);
        register.receivePayment(100, PENNY);

        double change = register.giveChange();

        System.out.printf("Change: %.2f\n", change);
        System.out.println("Expected Change: 1.71");
    }
}
