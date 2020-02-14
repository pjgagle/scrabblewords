import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScrabbleTest {

    @Test
    void sixLetterWordTest() {
        String word = "tester";
        Scrabble scrabble = new Scrabble(word);
        assertEquals(6, scrabble.getScore());
    }

    @Test
    void extremelyLongWord() {
        String word = "impedimenta";
        Scrabble scrabble = new Scrabble(word);
        assertEquals(18, scrabble.getScore());
    }

    @Test
    void veryShortWord() {
        String word = "the";
        Scrabble scrabble = new Scrabble(word);
        assertEquals(6, scrabble.getScore());
    }

    @Test
    void oneLetterWord() {
        String word = "A";
        Scrabble scrabble = new Scrabble(word);
        assertEquals(1, scrabble.getScore());
    }

    @Test
    void upperCaseWord() {
        String word = "rEd";
        Scrabble scrabble = new Scrabble(word);
        assertEquals(4, scrabble.getScore());
    }

    @Test
    void symbolWord() {
        String word = "@te";
        Scrabble scrabble = new Scrabble(word);
        assertEquals(2, scrabble.getScore());
    }


}