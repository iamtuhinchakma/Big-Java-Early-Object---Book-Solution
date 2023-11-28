package Interface.e1;

public class QuizTester {
    public static void main(String[] args) {
        Measurable quizData[] = new Measurable[3];
        quizData[0] = new Quiz(89, "B+");
        quizData[1] = new Quiz(90, "A-");
        quizData[2] = new Quiz(73, "C");
        Quiz max = (Quiz) Data.largest(quizData);
        Quiz min = (Quiz) Data.smallest(quizData);

        double avg = Data.average(quizData);
        System.out.println("Average score: " + avg);

        System.out.println(max.getScore() + " " + min.getScore());
        System.out.println(max.getGrade());
    }
}
