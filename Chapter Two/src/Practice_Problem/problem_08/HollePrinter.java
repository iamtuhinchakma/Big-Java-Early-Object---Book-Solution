package problem_08;

public class HollePrinter {
    private String initial;
    public HollePrinter(){
        initial = "Hello, World!"; //Hole Werld
    }
    public String replacing(){
        String newString = initial.replace("e", "#").replace("o","e").replace("#","o");
        return newString;
    }
}
