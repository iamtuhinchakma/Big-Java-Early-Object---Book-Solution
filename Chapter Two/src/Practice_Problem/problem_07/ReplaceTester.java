package problem_07;

public class ReplaceTester {
    private String str;
    public ReplaceTester(){
        str = "Mississippi";
    }
    public String replaceI(){
        String newString = str.replace("i", "!");
        return newString;
    }
    public String replaceS(){
        String newString = str.replace("s", "$");
        return newString;
    }
    public void newString(String ans){
        this.str = ans;
    }
}
