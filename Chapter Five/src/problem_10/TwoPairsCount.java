package problem_10;

import java.util.Scanner;

public class TwoPairsCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.printf("Enter the second number: ");
        int number2 = input.nextInt();
        System.out.printf("Enter the third number: ");
        int number3 = input.nextInt();
        System.out.printf("Enter the fourth number: ");
        int number4 = input.nextInt();

        int count1 = 0, count2 = 0, count3 = 0;
        if( number1 == number2 ) {
            count1 = count1 + 1;
        } else if ( number1 == number3 ) {
            count1 = count1 + 1;
        } else if ( number1 == number4 ) {
            count1 = count1 + 1;
        } else if ( number2 == number3 ) {
            count2 = count2 + 1;
        } else if ( number2 == number4 ) {
            count2 = count2 + 1;
        } else if ( number3 == number4 ) {
            count3 = count3 + 1;
        }

        if( (count1 == 2 && count2 == 2 ) || (count1 == 2 && count3 == 2) || (count1 == 2 && count3 == 2) || (count2 == 2 && count3 == 2) ) {
            System.out.println("Two pairs");
        } else {
            System.out.println("Not two pairs");
        }
    }
}
