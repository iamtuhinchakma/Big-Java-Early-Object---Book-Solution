package problem_09;

public class Student {
    private double[] scores;
    private int scoreSize;
    private String studentName;
    public Student( int scoreCapacity, String name){
        scores = new double[scoreCapacity];
        scoreSize = 0;
        studentName = name;
    }
    public boolean addScore( double score){
        if( scoreSize < scores.length){
            scores[scoreSize] = score;
            scoreSize++;
            return true;
        } else {
            return false;
        }
    }
    public double sum(){
        double total = 0;
        for( int i = 0; i < scoreSize; i++ ){
            total = total + scores[i];
        }
        return total;
    }
    public double minimum(){
        if( scoreSize == 0){
            return 0;
        } else {
            double smallest = scores[0];
            for ( int i = 1; i < scoreSize; i++ ){
                if( scores[i] < smallest ){
                    smallest = scores[i];
                }
            }
            return smallest;
        }
    }
    public double finalScore(){
        if( scoreSize == 0 ){
            return 0;
        } else if (scoreSize == 1) {
            return scores[0];
        } else {
            return (sum() - minimum());
        }
    }

}
