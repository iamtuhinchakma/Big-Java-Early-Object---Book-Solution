package problem_02;

import java.util.Scanner;

public class IdentifyFloatingPointNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        double number = input.nextDouble();
        if( number > 0 ) {
            System.out.println("Positive!");
        }
        else if ( number < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero!");
        }
        double absoluteValue = Math.abs(number);
        if( absoluteValue < 1 ) {
            System.out.println("Small!");
        }
        else if ( absoluteValue > 1000000 ) {
            System.out.println("Large!");
        }
    }
}
