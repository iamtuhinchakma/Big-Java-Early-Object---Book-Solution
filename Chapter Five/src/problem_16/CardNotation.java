package problem_16;

import java.util.Scanner;

public class CardNotation {
    private String notation;
    public CardNotation(String notation) {
        this.notation = notation.toUpperCase();
    }

    public String getDescription() {
        String rank = "";
        String suit = "";

        if (notation.length() < 2) {
            return "Unknown";
        }

        char firstChar = notation.charAt(0);
        char secondChar = notation.charAt(1);

        switch (firstChar) {
            case 'A':
                rank = "Ace";
                break;
            case '2':
                rank = "Two";
                break;
            case '3':
                rank = "Three";
                break;
            case '4':
                rank = "Four";
                break;
            case '5':
                rank = "Five";
                break;
            case '6':
                rank = "Six";
                break;
            case '7':
                rank = "Seven";
                break;
            case '8':
                rank = "Eight";
                break;
            case '9':
                rank = "Nine";
                break;
            case '1':
                if (notation.length() < 3) {
                    return "Unknown";
                }
                if (secondChar == '0') {
                    rank = "Ten";
                } else {
                    return "Unknown";
                }
                break;
            case 'J':
                rank = "Jack";
                break;
            case 'Q':
                rank = "Queen";
                break;
            case 'K':
                rank = "King";
                break;
            default:
                return "Unknown";
        }

        switch (secondChar) {
            case 'D':
                suit = "Diamonds";
                break;
            case 'H':
                suit = "Hearts";
                break;
            case 'S':
                suit = "Spades";
                break;
            case 'C':
                suit = "Clubs";
                break;
            default:
                return "Unknown";
        }

        return rank + " of " + suit;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the card notation: ");
        String cardNotation = scanner.next();

        scanner.close();


        CardNotation card = new CardNotation(cardNotation);
        String description = card.getDescription();
        System.out.println(description);
    }
}
