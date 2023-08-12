package problem_04;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a string: ");
        String str = input.nextLine();
        char firstLetter = str.charAt(0);
        char lastLetter = str.charAt(str.length() - 1);
        if( firstLetter == lastLetter ) {
            System.out.println("first and last letter same");
        }
        else {
            System.out.println("first and last letter different");
        }
    }
}
