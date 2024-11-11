public class BasketBallTeam {
    // Instance variables
    private String schoolName;
    private int wonGames;
    private int lostGames;
    private int totalPoints;
    private int totalFouls;

    // Constructor
    public BasketBallTeam(String schoolName) {
        this.schoolName = schoolName;
        this.wonGames = 0;
        this.lostGames = 0;
        this.totalPoints = 0;
        this.totalFouls = 0;
    }

    // Getters
    public String getSchoolName() {
        return schoolName;
    }

    public int getNumOfWonGames() {
        return wonGames;
    }

    public int getNumOfLostGames() {
        return lostGames;
    }

    public int getNumOfPoints() {
        return totalPoints;
    }

    public int getNumOfOFouls() {
        return totalFouls;
    }

    // Setters
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setWonGames(int wonGames) {
        this.wonGames = wonGames;
    }

    public void setLostGames(int lostGames) {
        this.lostGames = lostGames;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public void setNumOfFouls(int totalFouls) {
        this.totalFouls = totalFouls;
    }

    // Additional methods
    public void addNumOfWonGames(int wins) {
        this.wonGames += wins;
    }

    public void addNumOfLostGames(int losses) {
        this.lostGames += losses;
    }

    public void addNumOfPoints(int points) {
        this.totalPoints += points;
    }

    public void addNumOfFouls(int fouls) {
        this.totalFouls += fouls;
    }

    // toString method
    @Override
    public String toString() {
        return "Basketball Team: " + schoolName + "\n" +
                "Record: " + wonGames + " wins, " + lostGames + " losses\n" +
                "Total Points Scored: " + totalPoints + "\n" +
                "Total Fouls Committed: " + totalFouls + "\n" +
                "Win Percentage: " + String.format("%.2f", calculateWinPercentage()) + "%";
    }

    // Helper method to calculate win percentage
    private double calculateWinPercentage() {
        int totalGames = wonGames + lostGames;
        if (totalGames == 0) {
            return 0.0;
        }
        return (double) wonGames / totalGames * 100;
    }

}