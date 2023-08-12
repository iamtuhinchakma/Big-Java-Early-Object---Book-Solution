package problem_14;

public class GradUpgraded {
    public static String getLetterGrade(double grade){
        if( grade >= 4.0 ) {
            return "A";
        } else if ( grade >= 3.85) {
            return "A-";
        } else if ( grade >= 3.50 ) {
            return "B+";
        } else if ( grade >= 2.85 ) {
            return "B";
        } else if ( grade >= 2.50 ) {
            return "B-";
        } else if ( grade >= 1.50) {
            return "C-";
        }
    }
    public static void main(String[] args) {

    }
}
