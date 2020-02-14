import java.util.HashMap;
import java.util.Map;

public class Scrabble {
    public String word;

    public Scrabble(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public int getScore() {
        Map<Character, Integer> letterMap = new HashMap<Character, Integer>();
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*)(+=?/,.-`~_><}{];:[" +
                "1234567890";

        for (int i = 0; i <letters.length(); i++) {
            if (letters.charAt(i) == 'A' || letters.charAt(i) == 'E' || letters.charAt(i) == 'I' ||
                    letters.charAt(i) == 'O' || letters.charAt(i) == 'U' || letters.charAt(i) == 'L' ||
                    letters.charAt(i) == 'N' || letters.charAt(i) == 'R' || letters.charAt(i) == 'S' ||
                    letters.charAt(i) == 'T') {
                letterMap.put(letters.charAt(i), 1);
                letterMap.put(letters.toLowerCase().charAt(i), 1);
            }
            if (letters.charAt(i) == 'D' || letters.charAt(i) == 'G') {
                letterMap.put(letters.charAt(i), 2);
                letterMap.put(letters.toLowerCase().charAt(i), 2);
            }
            if (letters.charAt(i) == 'B' || letters.charAt(i) == 'C' || letters.charAt(i) == 'M' ||
                    letters.charAt(i) == 'P') {
                letterMap.put(letters.charAt(i), 3);
                letterMap.put(letters.toLowerCase().charAt(i), 3);
            }
            if (letters.charAt(i) == 'F' || letters.charAt(i) == 'H' || letters.charAt(i) == 'V' ||
                    letters.charAt(i) == 'W' || letters.charAt(i) == 'Y') {
                letterMap.put(letters.charAt(i), 4);
                letterMap.put(letters.toLowerCase().charAt(i), 4);
            }
            if (letters.charAt(i) == 'K') {
                letterMap.put(letters.charAt(i), 5);
                letterMap.put(letters.toLowerCase().charAt(i), 5);
            }
            if (letters.charAt(i) == 'J' || letters.charAt(i) == 'X') {
                letterMap.put(letters.charAt(i), 8);
                letterMap.put(letters.toLowerCase().charAt(i), 8);
            }
            if (letters.charAt(i) == 'Q' || letters.charAt(i) == 'Z') {
                letterMap.put(letters.charAt(i), 10);
                letterMap.put(letters.toLowerCase().charAt(i), 10);
            }
            if (letters.charAt(i) == '!' || letters.charAt(i) == '@' || letters.charAt(i) == '#' ||
                    letters.charAt(i) == '$' || letters.charAt(i) == '%' || letters.charAt(i) == '^' ||
                    letters.charAt(i) == '&' || letters.charAt(i) == '*' || letters.charAt(i) == ')' ||
                    letters.charAt(i) == '(' || letters.charAt(i) == '+' || letters.charAt(i) == '=' ||
                    letters.charAt(i) == '?' || letters.charAt(i) == '/' || letters.charAt(i) == ',' ||
                    letters.charAt(i) == '.' || letters.charAt(i) == '-' || letters.charAt(i) == '`' ||
                    letters.charAt(i) == '~' || letters.charAt(i) == '_' || letters.charAt(i) == '>' ||
                    letters.charAt(i) == ';' || letters.charAt(i) == ':' || letters.charAt(i) == '<' ||
                    letters.charAt(i) == '}' || letters.charAt(i) == '{' || letters.charAt(i) == ']' ||
                    letters.charAt(i) == '[' || letters.charAt(i) == '1' || letters.charAt(i) == '2' ||
                    letters.charAt(i) == '3' || letters.charAt(i) == '4' || letters.charAt(i) == '5' ||
                    letters.charAt(i) == '6' || letters.charAt(i) == '7' || letters.charAt(i) == '8' ||
                    letters.charAt(i) == '9' || letters.charAt(i) == '0') {
                letterMap.put(letters.charAt(i), 0);
            }
        }
        int totalValue = 0;

        for (int j = 0; j < word.length(); j++){
            totalValue += letterMap.get(word.charAt(j));
        }
        return totalValue;
    }


}
