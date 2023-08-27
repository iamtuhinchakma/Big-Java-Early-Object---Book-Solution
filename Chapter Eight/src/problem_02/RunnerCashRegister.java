package problem_02;

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

        register.receivePayment(40, DOLLAR);

        System.out.printf("Total Purchase: $%5.2f\nTotal Payment:  $%5.2f\nTotal Change:   $%5.2f\n",
                register.getTotalPurchase(), register.getTotalPayment(), register.getTotalChange());
        System.out.println("-----------------------------------------------------------");
        System.out.printf("Number of Dollars: %3d\n", register.giveChange(DOLLAR));
        System.out.printf("Number of Quarters: %2d\n", register.giveChange(QUARTER));
        System.out.printf("Number of Dimes: %5d\n", register.giveChange(DIME));
        System.out.printf("Number of Nickels: %3d\n", register.giveChange(NICKEL));
        System.out.printf("Number of Pennies: %3d\n", register.giveChange(PENNY));
    }
}
