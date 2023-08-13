package problem_17;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the three number: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double largestNumber = Math.max(num1, Math.max(num2,num3));
        System.out.println("The largest number is: " + largestNumber);
    }
}
