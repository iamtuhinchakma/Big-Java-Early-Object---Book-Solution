package problem_13;

import java.util.Scanner;

public class Grade {
    private static double getNumericGrade(String letterGrade) {
        switch (letterGrade) {
            case "A": return 4.0;
            case "A+": return (4.0 + 0.3);
            case "A-": return (4.0 - 0.3);
            case "B": return  3.0;
            case "B+": return (3.0 + 0.3);
            case "B-": return (3.0 - 0.3);
            case "C": return 2.0;
            case "C+": return (2.0 + 0.3);
            case "C-": return (2.0 - 0.3);
            case "D": return 1.0;
            case "D+": return (1.0 + 0.3);
            case "D-": return (1.0 - 0.3);
            case "F": return 0.0;
            default:
                System.out.println("Invalid letter grade!");
                return -1.0;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a letter grade: ");
        String letterGrade = input.nextLine().toUpperCase();

        input.close();
        double numericValue = getNumericGrade(letterGrade);
        System.out.println("The numeric value is " + numericValue);

    }
}
