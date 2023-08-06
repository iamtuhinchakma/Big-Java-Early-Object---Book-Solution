package Practice_Problem.problem_03;

import java.awt.*;

public class AreaTester {
    private double height, width;
    public AreaTester(double height, double width){
        this.width = width;
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
    public double getArea(){
        return height * width;
    }
}
