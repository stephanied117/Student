public class Game {
    private String gameName;
    private int playerCount;
    private int score;
    public Game(String gameName, int player) {
        this.gameName = gameName;
        this.playerCount = player;
        score = 0;
    }
    public String getGameName() {
        return gameName;
    }
    public int getPlayers() {
        return playerCount;
    }
    public int getScore() {
        return score;
    }
    public void setGameName(String setGameName) {
        gameName = setGameName;
    }
    public void addPlayer() {
        playerCount++;
    }
    public void increaseScore(int amount) {
        score += amount;
    }
    public double averageScorePerPlayer() {
        return (double) score / (double) playerCount;
    }
    public boolean isGameOver() {
        if (score > 9) {
            return true;
        } else {
            return false;
        }
    }
}

