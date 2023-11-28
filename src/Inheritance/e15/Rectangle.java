package Inheritance.e15;

public class Rectangle extends java.awt.Rectangle{
    public Rectangle(){
        super();
    }
    public double getPerimeter(){
        return 2 * (getHeight() + getWidth() );
    }
    public double getArea() {
        return getHeight() * getWidth();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Area: " + rectangle.getArea());
    }
}
