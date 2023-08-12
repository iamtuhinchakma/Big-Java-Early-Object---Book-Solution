package problem_05;

import java.util.Scanner;

public class WordCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a word: ");
        String str = input.nextLine();
        //Removing middle character
        if( str.length() % 2 == 1 ) {
            str = str.substring(0, str.length() / 2) + str.substring(str.length() / 2 + 1);
        }
        String firstHalf = str.substring(0, str.length() / 2);
        String secondHalf = str.substring(str.length() / 2);
        if(firstHalf.equals(secondHalf)) {
            System.out.println("first and second half same.");
        } else {
            System.out.println("first and second half different");
        }
    }
}
