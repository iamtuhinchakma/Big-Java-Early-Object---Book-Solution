package problem_01;

import java.util.Scanner;

public class IdentifyNumber {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        number = input.nextInt();
        if( number > 0 ) {
            System.out.println("Positive!");
        }
        else if ( number < 0) {
            System.out.println("Negative!");
        }
        else {
            System.out.println("Zero!");
        }
    }
}
