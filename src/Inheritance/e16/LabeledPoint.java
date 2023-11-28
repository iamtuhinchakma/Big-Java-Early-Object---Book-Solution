package Inheritance.e16;

public class LabeledPoint {
    private int x;
    private int y;
    private String label;

    public LabeledPoint(int x, int y, String label) {
        this.x = x;
        this.y = y;
        this.label = label;
    }
    public String toString(){
        return "LabeledPoint[x = " + ", y = " + y + ", label = " + label + "]";
    }

    public static void main(String[] args) {
        LabeledPoint obj = new LabeledPoint(7, 19, "Don't click here!");
        System.out.println(obj);
        System.out.println("Expected: LabeledPoint[x = 7, y = 19, label = Don't clocke here!]");
    }
}
