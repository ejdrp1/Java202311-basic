package variableMethod.basic.teamOfRankingCalculator;

public class Team {

    private int winMatches; // 승
    private int drawMatches; // 무
    private int loseMatches; // 패
    private int matches; // 경기 수
    private int score; // 득점
    private int losePoint; // 실점
    private int differenceBetweenGainsAndLosses; // 득실차

    public Team(int winMatches, int drawMatches, int loseMatches, int matches, int score, int losePoint, int differenceBetweenGainsAndLosses) {
        this.winMatches = winMatches;
        this.drawMatches = drawMatches;
        this.loseMatches = loseMatches;
        this.matches = matches;
        this.score = score;
        this.losePoint = losePoint;
        this.differenceBetweenGainsAndLosses = differenceBetweenGainsAndLosses;
    }

    public int getWinMatches() {
        return winMatches;
    }

    public void setWinMatches(int winMatches) {
        this.winMatches = winMatches;
    }

    public int getDrawMatches() {
        return drawMatches;
    }

    public void setDrawMatches(int drawMatches) {
        this.drawMatches = drawMatches;
    }

    public int getLoseMatches() {
        return loseMatches;
    }

    public void setLoseMatches(int loseMatches) {
        this.loseMatches = loseMatches;
    }

    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLosePoint() {
        return losePoint;
    }

    public void setLosePoint(int losePoint) {
        this.losePoint = losePoint;
    }

    public int getDifferenceBetweenGainsAndLosses() {
        return differenceBetweenGainsAndLosses;
    }

    public void setDifferenceBetweenGainsAndLosses(int differenceBetweenGainsAndLosses) {
        this.differenceBetweenGainsAndLosses = differenceBetweenGainsAndLosses;
    }

}
