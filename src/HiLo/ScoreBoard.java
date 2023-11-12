package HiLo;

public class ScoreBoard {
    private Player winner;
    private int record;

    public ScoreBoard() {
        this.winner = null;
        this.record = 0;
    }

    public void update(Player player) {
        this.winner = player;
        this.record = player.record;
    }

    public int getRecord() {
        return this.record;
    }

    public void display() {
        System.out.println("Winner: " + winner.username + ". Score: " + Integer.toString(record));
    }
}
