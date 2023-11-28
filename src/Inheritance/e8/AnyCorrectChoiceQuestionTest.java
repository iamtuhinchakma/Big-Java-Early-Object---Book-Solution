package Inheritance.e8;

import java.util.ArrayList;
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
class NumericQuestion extends Question {
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
class AnyCorrectChoiceQuestion extends Question{
    private ArrayList<String> choices;
    private String choiceString;
    public AnyCorrectChoiceQuestion(String questionText){
        super(questionText);
        choices = new ArrayList<String>();
    }
    public void addChoice(String choice, boolean correct){
        choices.add(choice);
        if(correct){
            if(choiceString == null){
                choiceString = "" + choices.size();
            } else {
                choiceString += " " + choices.size();
            }
        }
    }
    public boolean checkAnswer(String response){
        return choiceString.indexOf(response) > -1;
    }
    public void display(){
        super.display();
        System.out.println("Provide any of the correct choices");
        for(int i = 0; i < choices.size(); i++){
            int choiceNumber = i + 1;
            System.out.println(choiceNumber + ": " + choices.get(i));
        }
    }
}
public class AnyCorrectChoiceQuestionTest {
    public static void main(String[] args) {
        Question[] quiz = new Question[2];

        AnyCorrectChoiceQuestion question0 = new AnyCorrectChoiceQuestion(
                "Which countries are in Africa?");
        question0.addChoice("Ghana", true);
        question0.addChoice("Canada", false);
        question0.addChoice("Benin", true);
        question0.addChoice("Denmark", false);
        quiz[0] = question0;

        AnyCorrectChoiceQuestion question1 = new AnyCorrectChoiceQuestion(
                "Which of the following are vegetables?");
        question1.addChoice("Zuchini", true);
        question1.addChoice("Pepper", true);
        question1.addChoice("Banana", false);
        question1.addChoice("Cabbage", true);
        quiz[1] = question1;

        Scanner in = new Scanner(System.in);
        for (Question q : quiz)
        {
            q.display();
            System.out.println("Your answer: ");
            String response = in.nextLine();
            System.out.println(q.checkAnswer(response));
        }
    }
}
