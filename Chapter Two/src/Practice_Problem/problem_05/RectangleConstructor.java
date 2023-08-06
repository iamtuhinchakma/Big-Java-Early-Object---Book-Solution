package Practice_Problem.problem_05;

public class RectangleConstructor {
    private double area, perimeter;
    public RectangleConstructor(){
        this.area = 42;
        this.perimeter = 42;
    }
    public void getHeightAndWidthOfRectangle(){
        double height = Math.sqrt(area);
        double width = height;
        System.out.println("Height of the Rectangle: " + height);
        System.out.println("Width of the Rectangle: " + width);
    }
    public void getHeightAndWidthOfPerimeterRectangle(){
        double height = Math.sqrt(perimeter);
        double width = height;
        System.out.println("Height of the Rectangle2: " + height);
        System.out.println("Width of the Rectangle2: " + width);
    }

}
