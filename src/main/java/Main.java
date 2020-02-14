import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = console.nextLine();
        Scrabble scrabble = new Scrabble(word);
        System.out.println(word + " is worth " + scrabble.getScore());
    }

}
