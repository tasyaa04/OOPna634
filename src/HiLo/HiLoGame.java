package HiLo;
import java.util.Random;

public class HiLoGame{
    private int answer;
    private int maxNumber;
    private int nMatches;
    public int correctGuesses;
    private int nGuesses;
    public boolean over;

    public HiLoGame() {
        this.answer = new Random().nextInt(100) + 1;
        this.maxNumber = 10;
        this.nMatches = 0;
        this.correctGuesses = 0;
        this.over = false;
    }

    public String makeGuess(int x) {
        nGuesses += 1;
        if (x == this.answer) {
            correctGuesses += 1;
            over = true;
            return winGame();
        } else {
            if (nGuesses < maxNumber) {
                if (x < answer) {
                    return "Incorrect. Go higher.";
                } else {
                    return "Incorrect. Go lower.";
                }
            } else {
                over = true;
                return gameOver();
            }
        }
    }

    public String winGame() {
        return "Correct! You won in " + Integer.toString(nGuesses) + "! Try again Y | N?";
    }

    public String gameOver() {
        return "Game over! Rematch? Y | N";
    }

    public void rematch() {
        nMatches += 1;
        answer = new Random().nextInt(100) + 1;
        nGuesses = 0;
        over = false;
    }

    public String changeDifficulty() {
        if (maxNumber > 0) {
            maxNumber--;
            return "Difficulty increased.";
        } else {
            return "Maximum difficulty already reached.";
        }
    }
}