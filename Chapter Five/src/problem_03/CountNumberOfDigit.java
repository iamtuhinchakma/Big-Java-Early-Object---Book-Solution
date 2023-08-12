package problem_03;

import java.util.Scanner;

public class CountNumberOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int number = input.nextInt();
        if( number < 0 ) {
            number = number * (-1);
        }
        int count = 1;
        do {
            number = number / 10;
            count = count + 1;
        } while( number >= 10 );
        System.out.println("The number of Digit is: " + count );
    }
}
