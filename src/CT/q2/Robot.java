package CT.q2;

import java.awt.*;

public class Robot {
    private int xCoordinate;
    private int yCoordinate;
    private char direction;

    public Robot(int xCoordinate, int yCoordinate, char direction) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
    }

    public void turnLeft() {
        switch (direction) {
            case 'N':
                direction = 'W';
                break;
            case 'E':
                direction = 'N';
                break;
            case 'S':
                direction = 'E';
                break;
            case 'W':
                direction = 'S';
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case 'N':
                direction = 'E';
                break;
            case 'E':
                direction = 'S';
                break;
            case 'S':
                direction = 'W';
                break;
            case 'W':
                direction = 'N';
                break;
        }
    }

    public void move() {
        switch (direction) {
            case 'N':
                yCoordinate++;
                break;
            case 'E':
                xCoordinate++;
                break;
            case 'S':
                yCoordinate--;
                break;
            case 'W':
                xCoordinate--;
                break;
        }
    }

    public Point getLocation() {
        return new Point(xCoordinate, yCoordinate);
    }

    public String getDirection() {
        return String.valueOf(direction);
    }

    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, 'N');
        String direction = robot.getDirection();
        robot.move(); // 0 1 N
        robot.move();
        robot.turnRight();
        robot.move();
        Point location = robot.getLocation();
        System.out.println(location.x + " " + location.y + " " + robot.direction);
    }
}
