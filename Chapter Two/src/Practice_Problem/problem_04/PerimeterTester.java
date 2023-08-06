package Practice_Problem.problem_04;

public class PerimeterTester {
    private double height, width;
    public PerimeterTester(double height, double width){
        this.height = height;
        this.width = width;
    }
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
    public double getPerimeter(){
        return 2 * (height + width);
    }
}
