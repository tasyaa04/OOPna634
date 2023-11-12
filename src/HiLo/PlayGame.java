package HiLo;
import java.util.Scanner;

public class PlayGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ScoreBoard s1 = new ScoreBoard();
        Player p1 = new Player("Player 1");
        s1.update(p1);
        System.out.println("Start game? Y | N");
        String inp = in.nextLine();
        if (inp.equals("Y")) {
            boolean keepPlaying = true;
            HiLoGame game = new HiLoGame();
            while (keepPlaying) {
                playMatch(in, game);

                inp = in.next();
                inp += in.nextLine();
                if (inp.equals("Y")) {
                    System.out.println("Increase difficulty? Y | N");
                    if (in.nextLine().equals("Y")) {
                        game.changeDifficulty();
                    }
                    game.rematch();
                } else {
                    if (game.correctGuesses > p1.record) {
                        p1.newHighScore(game.correctGuesses);
                    }
                    if (game.correctGuesses > s1.getRecord()) {
                        s1.update(p1);
                    }
                    keepPlaying = false;
                }
            }
            s1.display();
        }

    }

    public static void playMatch(Scanner in, HiLoGame game) {
        int guess;
        while (!game.over) {
            System.out.println("Please guess the number.");
            guess = in.nextInt();
            System.out.println(game.makeGuess(guess));
        }
    }
}
