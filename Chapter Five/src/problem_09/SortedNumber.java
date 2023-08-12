package problem_09;

import java.util.Scanner;

public class SortedNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.printf("Enter the second number: ");
        int number2 = input.nextInt();
        System.out.printf("Enter the third number: ");
        int number3 = input.nextInt();

        if( number1 <= number2 && number2 <= number3 || number3 <= number2 && number2 <= number1 ) {
            System.out.println("In order!");
        }
        else {
            System.out.println("not in order!");
        }
    }
}

