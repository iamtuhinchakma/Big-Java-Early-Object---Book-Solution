package CT.q3;

import java.util.Random;
import java.util.Scanner;

public class ComboLockTest {
    public static void main(String[] args) {
        ComboLock lock = new ComboLock(12, 12, 12);
        Scanner in = new Scanner(System.in);
        boolean opened = false;
        boolean turningRight = true;
        while(!opened) {
            System.out.println("Enter number of ticks to turn to the "
                    + (turningRight ? "right" : "left")
                    + " 0 - 39. Enter an invalid number to quit.");
            int ticks = in.nextInt();
            if (ticks < 0 || ticks > 39) {
                System.out.println("Invalid Entry!");
            }
            if (turningRight) {
                lock.turnRight(ticks);
            } else {
                lock.turnLeft(ticks);
            }
            turningRight = !turningRight;
            opened = lock.open();
        }
        System.out.println("You opened the lock!");
    }
}
//https://github.com/HungryTiger95/Big-Java-Early-Objects-Practice/blob/master/Chapter%2008/Projects/project1/testing/ComboLockTest.java
