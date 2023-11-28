package Inheritance.e7;

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
        //return answer.replaceAll("\\s+", "").equalsIgnoreCase(response.replaceAll("\\s+", ""));
        return response.trim().equalsIgnoreCase(answer.trim());
    }
    public void display(){
        System.out.println(text);
    }
}
class FillInQuestion extends Question {
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
public class CheckAnswerTest {
    public static void main(String[] args) {
        Question q = new Question("");
        q.setAnswer("james GOSLING");
        System.out.println(q.checkAnswer("JAMES gosling"));
        System.out.println("Expected: true");
        System.out.println(q.checkAnswer(" JAMES gosling"));
        System.out.println("Expected: true");
        System.out.println(q.checkAnswer("JAMES gosling "));
        System.out.println("Expected: true");
        System.out.println(q.checkAnswer("JAMES  gosling"));
        System.out.println("Expected: true");
        System.out.println(q.checkAnswer("james GOSLING."));
        System.out.println("Expected: false");
    }
}
