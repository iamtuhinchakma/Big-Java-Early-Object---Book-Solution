package Interface.e1;

public interface Measurable {
    double getMeasure();
}
class Data{
    public static Measurable largest(Measurable[] obj){
        Measurable largest = obj[0];
        for(int i = 0; i < obj.length; i++){
            if(obj[i].getMeasure() > largest.getMeasure()){
                largest = obj[i];
            }
        }
        return largest;
    }
    public static Measurable smallest(Measurable[] obj){
        Measurable smallest = obj[0];
        for(int i = 0; i < obj.length; i++){
            if(obj[i].getMeasure() < smallest.getMeasure()){
                smallest = obj[i];
            }
        }
        return smallest;
    }
    public static double average(Measurable[] obj){
        double sum = 0;
        for(Measurable o : obj){
            sum += o.getMeasure();
        }
        if(obj.length > 0){
            return (sum / obj.length);
        } else {
            return 0;
        }
    }
}
class Quiz implements Measurable{
    private double score;
    private String grade;
    public Quiz(double score, String grade){
        this.score = score;
        this.grade = grade;
    }
    public double getScore(){
        return score;
    }
    public String getGrade(){
        return grade;
    }
    public double getMeasure(){
        return score;
    }
}
