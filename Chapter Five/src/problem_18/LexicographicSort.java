package problem_18;

import java.util.Arrays;
import java.util.Scanner;

public class LexicographicSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter three string: ");
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        String str3 = input.nextLine();

        String[] str = {str1, str2, str3};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
    }
}
