package Inheritance.e9;

import java.util.ArrayList;
import java.util.Scanner;

class Question{
    private String text;
    private String answer;
    public Question(String questionText){
        text = questionText;
        answer = "";
    }
    public void setText(String questionText){
        text = questionText;
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
/*
class ChoiceQuestion extends Question{
    private ArrayList<String> choices = new ArrayList<String>();
    public void addChoice(String choice, boolean correct){
        choices.add(choice);
        if(correct){
            String choiceString = "" + choices.size();
            setAnswer(choiceString);
        }
    }
    public void display(){
        super.display();
        for(int i = 0; i < choices.size(); i++){
            int choiceNumber = i + 1;
            System.out.println(choiceNumber + ": " + choices.get(i));
        }
    }
}

class MultipleChoiceQuestion extends ChoiceQuestion{
    private String choiceString ="";
    private int numberOfChoices;

    public void addChoice(String choice, boolean correct){
        super.addChoice(choice, correct);
        numberOfChoices++;
        if(correct){
            if(choiceString.length() == 0){
                choiceString = "" + numberOfChoices;
            } else {
                choiceString = choiceString + " " + numberOfChoices;
            }
        }
        setAnswer(choiceString);
    }
    public void display(){
        super.display();
        System.out.println("Enter all correct choices seperated by spaces!");
    }
}
public class MultipleChoiceQuestionTest {
    public static void main(String[] args)
    {
        ChoiceQuestion q = new MultipleChoiceQuestion();
        q.setText("Which programming languages use { } for blocks?");
        q.addChoice("Java", true);
        q.addChoice("Python", false);
        q.addChoice("C++", true);
        q.addChoice("Scheme", false);

        presentQuestion(q);

        ChoiceQuestion q2 = new MultipleChoiceQuestion();
        q2.setText("Which of these classes implement the Comparable interface?");
        q2.addChoice("java.lang.String", true);
        q2.addChoice("java.util.ArrayList", false);
        q2.addChoice("java.util.Scanner", false);
        q2.addChoice("java.io.File", true);

        presentQuestion(q2);
    }

    public static void presentQuestion(Question q)
    {
        q.display();
        System.out.print("Your answer: ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
    }
}
8?
 */
