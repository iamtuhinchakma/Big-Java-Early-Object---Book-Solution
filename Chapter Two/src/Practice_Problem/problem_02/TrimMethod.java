package Practice_Problem.problem_02;

public class TrimMethod {
    private String anyString;
    public TrimMethod(){
        anyString = "      Tuhin   ";
    }
    public String usingTrimMethod(){
        String ans = anyString.trim();
        return ans;
    }
    public String removeSpace(){
        String ans = anyString.replace(" ", "");
        return ans;
    }
}
