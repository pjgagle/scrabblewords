public class Scrabble {
    private String word;

    public Scrabble(String word) {
        this.word = word;
    }

    public static int calculateWordValue(String word) {

        int total = 0;

        for (int i = 0; i < word.length(); i++) {
            total += letterValue(word.charAt(i));
        }

        return total;
    }

    public static int letterValue(char letter) {



        if(letter=='A' || letter=='E' || letter=='I' || letter=='O'
        || letter=='U' || letter=='L' || letter== 'N' || letter=='R'
        || letter=='S' || letter=='T') {
            return 1;
        }

        if (letter=='D' || letter=='G') {
            return 2;
        }

        if (letter=='B' || letter=='C' || letter=='M' || letter=='P') {
            return 3;
        }

        if (letter=='F' || letter=='H' || letter=='V' || letter=='W'
        || letter=='Y') {
            return 4;
        }

        if (letter=='K') {
            return 5;
        }

        if (letter=='J' || letter=='K') {
            return 8;
        }

        if (letter=='Q' || letter=='Z') {
            return 10;
        }

       return 0;
    }
}
