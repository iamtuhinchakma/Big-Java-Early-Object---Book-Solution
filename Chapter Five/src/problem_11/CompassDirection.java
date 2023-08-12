package problem_11;

import java.util.Scanner;

public class CompassDirection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the angle in degrees: ");
        int angle = input.nextInt();

        input.close();
        //Ensuring angle is positive and in range of [0, 360]
        angle = (angle % 360 + 360) % 360;

        String[] directions = { "N", "NE", "E", "SE", "S", "SW", "W", "NW", "N"};
        int[] angles = { 0, 45, 90, 135, 180, 225, 270, 315};

        int nearestDirectionIndex = 0;
        int minDifference = Math.abs(angle - angles[0]);
        for ( int start = 1; start < angles.length; start++) {
            int difference = Math.abs( angle - angles[start]);
            if ( difference < minDifference ) {
                nearestDirectionIndex = start;
                minDifference = difference;
            }
        }
        System.out.println("The nearest directions of the given angles: " + directions[nearestDirectionIndex]);
    }
}
