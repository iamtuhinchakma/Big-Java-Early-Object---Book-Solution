package Practice_Problem;

public class ReplaceString {
    private String name;
    public ReplaceString(){
        name = "Mississippi";
    }
    public String replaceI(){
        String newString = name.replace("i", "ii");
        return newString;
    }
    public int stringLength(String name){
        return name.length();
    }
    public String replaceSS(){
        String newString = name.replace("ss", "s");
        return newString;
    }
    public void newStringReplace(String ans){
        this.name = ans;
    }
}
