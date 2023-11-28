package Inheritance.e14;
import java.awt.Rectangle;
class BetterRectangle extends Rectangle{
    public BetterRectangle(int x, int y, int width, int height){
        setLocation(x, y);
        setSize(width, height);
    }
    public double getPerimeter(){
        return 2 * (getHeight() + getWidth() );
    }
    public double getArea(){
        return getHeight() * getWidth();
    }
}
public class RectangleTester {
    public static void main(String[] args) {
        BetterRectangle rectangle = new BetterRectangle(10, 20, 50, 30);
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Area: " + rectangle.getArea());
    }
}
