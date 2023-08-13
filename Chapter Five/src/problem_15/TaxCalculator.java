package problem_15;

import java.util.Scanner;

public class TaxCalculator {
    public static final double PERCENT1 = 0.01;
    public static final double PERCENT2 = 0.02;
    public static final double PERCENT3 = 0.03;
    public static final double PERCENT4 = 0.04;
    public  static final double PERCENT5 = 0.05;
    public static final double PERCENT6 = 0.06;

    public static double IncomeTaxCalc(double income){
        double tax = 0;
        if (income <= 50000) {
            tax = income * 0.01;
        } else if (income <= 75000) {
            tax = 50000 * 0.01 + (income - 50000) * 0.02;
        } else if (income <= 100000) {
            tax = 50000 * 0.01 + 25000 * 0.02 + (income - 75000) * 0.03;
        } else if (income <= 250000) {
            tax = 50000 * 0.01 + 25000 * 0.02 + 25000 * 0.03 + (income - 100000) * 0.04;
        } else if (income <= 500000) {
            tax = 50000 * 0.01 + 25000 * 0.02 + 25000 * 0.03 + 150000 * 0.04 + (income - 250000) * 0.05;
        } else {
            tax = 50000 * 0.01 + 25000 * 0.02 + 25000 * 0.03 + 150000 * 0.04 + 250000 * 0.05 + (income - 500000) * 0.06;
        }
        return tax;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter your income: ");
        double income = input.nextDouble();
        double ans = IncomeTaxCalc(income);
        System.out.println("\n" + "Total tax you have to pay: " + ans);
    }
}
