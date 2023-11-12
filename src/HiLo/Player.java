package HiLo;

public class Player {
    public String username;
    public int record;

    public Player(String username) {
        this.username = username;
        this.record = 0;
    }

    public void newHighScore(int record) {
        this.record = record;
    }
}
