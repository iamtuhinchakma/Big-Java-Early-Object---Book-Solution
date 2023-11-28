package Inheritance.e17;

import java.awt.*;

public class LabeledPoint {
    private Point p;
    private String label;
    public LabeledPoint(int x, int y, String label){
        p = new Point(x, y);
        this.label = label;
    }
    public String toString(){
        return p.toString() + " label = " + label;
    }

    public static void main(String[] args) {
        LabeledPoint obj = new LabeledPoint(7, 19, "Don't click here!");
        System.out.println(obj);
        System.out.println("Expected: LabeledPoint[x = 7, y = 19, label = Don't clocke here!]");
    }
}
