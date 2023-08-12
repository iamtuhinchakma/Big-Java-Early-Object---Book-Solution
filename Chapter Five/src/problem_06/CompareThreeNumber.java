package problem_06;

import java.util.Scanner;

public class CompareThreeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the first Number: ");
        int number1 = input.nextInt();
        System.out.printf("Enter the second Number: ");
        int number2 = input.nextInt();
        System.out.printf("Enter the third Number: ");
        int number3 = input.nextInt();
        if( number1 == number2 && number2 == number3 ) {
            System.out.printf("All the same.");
        }
        else if ( number1 != number2 && number2 != number3 && number3 != number1){
            System.out.printf("All different.");
        }
        else {
            System.out.printf("Neither.");
        }
        System.out.println();
    }
}
