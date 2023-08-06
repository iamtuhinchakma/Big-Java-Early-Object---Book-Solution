package Practice_Problem.problem_01;
import Practice_Problem.ReplaceString;

public class RunnerReplaceString {
    public static void main(String[] args) {
        ReplaceString result = new ReplaceString();
        String firstString = result.replaceI();
        System.out.println(firstString + "\n" + firstString.length());

        result.newStringReplace(firstString);
        String secondString = result.replaceSS();
        System.out.println(secondString + "\n" + secondString.length());
    }

}
