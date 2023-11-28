package Inheritance.e5;

import java.util.Scanner;

class Question{
    private String text;
    private String answer;
    public Question(String questionText){
        text = questionText;
        answer = "";
    }
    public void setAnswer(String questionAnswer){
        answer = questionAnswer;
    }
    public boolean checkAnswer(String response){
        return response.equals(answer);
    }
    public void display(){
        System.out.println(text);
    }
}
class NumericQuestion extends Question{
    private double answer;
    private static final double EPSILON = 0.01;
    public NumericQuestion(String questionText) {
        super(questionText);
    }
    public void setAnswer(double questionAnswer){
        answer = questionAnswer;
    }
    @Override
    public boolean checkAnswer(String response){
        double numericResponse = Double.valueOf(response);
        return Math.abs(numericResponse - answer) <= EPSILON;
    }
}
public class QuestionTest {
    public static void main(String[] args) {
        Question[] quiz = new Question[2];
        quiz[0] = new Question("Who is the inventor of Java?");
        quiz[0].setAnswer("James Gosling");

        NumericQuestion question = new NumericQuestion("What is 3 / 4?");
        question.setAnswer(0.75);
        quiz[1] = question;

        Scanner in = new Scanner(System.in);
        for(Question q : quiz){
            q.display();
            System.out.println("Enter your response: ");
            String response = in.nextLine();
            System.out.println(q.checkAnswer(response));
        }
    }
}
