package problem_07;

public class RunnerReplaceTester {
    public static void main(String[] args) {
        ReplaceTester ans = new ReplaceTester();
        String str = ans.replaceI();
        ans.newString(str);
        ans.replaceS();
        System.out.println(str);
    }
}
