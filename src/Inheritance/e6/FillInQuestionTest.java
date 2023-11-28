package Inheritance.e6;
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
class FillInQuestion extends Question{
    public FillInQuestion(String questionText){
        super(removeAnswer(questionText));
        int start = questionText.indexOf("_");
        int end = questionText.lastIndexOf("_");
        setAnswer(questionText.substring(start + 1, end));
    }
    private static String removeAnswer(String questionText){
        int start = questionText.indexOf("_");
        int end = questionText.lastIndexOf("_");
        return questionText.substring(0, start + 1) + "___" + questionText.substring(end);
    }
}
public class FillInQuestionTest {
    public static void main(String[] args) {
        Question[] quiz = new Question[2];

        FillInQuestion question0 = new FillInQuestion("The first U.S. president was _George Washington_");
        quiz[0] = question0;
        FillInQuestion question1 = new FillInQuestion("_James Gosling_ was the inventor of Java.");
        quiz[1] = question1;

        Scanner in = new Scanner(System.in);
        for(Question q : quiz){
            q.display();
        }
    }
}
