package problem_07;

import java.util.Scanner;

public class IncreasingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.printf("Enter the second number: ");
        int number2 = input.nextInt();
        System.out.printf("Enter the third number: ");
        int number3 = input.nextInt();
        if( number1 < number2 && number2 < number3 ) {
            System.out.println("increasing!");
        } else if ( number1 > number2 && number2 > number3) {
            System.out.println("decreasing!");
        } else {
            System.out.println("neither!");
        }
    }
}
