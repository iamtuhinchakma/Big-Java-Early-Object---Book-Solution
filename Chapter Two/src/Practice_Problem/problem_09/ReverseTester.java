package problem_09;

public class ReverseTester {
    public static void main(String[] args) {
        String initial = "desserts";
        StringBuilder stringBuilder = new StringBuilder(initial);
        stringBuilder.reverse();
        String reversedString = stringBuilder.toString();
        System.out.println(initial);
        System.out.println("Expected output is : \"stressed\"" + "\n" + "Actual String is: " + reversedString);
    }
}
