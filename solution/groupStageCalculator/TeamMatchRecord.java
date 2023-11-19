package groupStageCalculator;

public class TeamMatchRecord extends Team {

    private int winMatches = 0; // 승
    private int drawMatches = 0; // 무
    private int loseMatches = 0; // 패
    private int scorePoint = 0; // 득점
    private int losePoint = 0; // 실점
    private int differenceBetweenGainsAndLosses = 0; // 득실차
    private int point = 0; // 승점
    private int matchesNum = 0; // 경기수


    public TeamMatchRecord() {
    }

    public TeamMatchRecord(int winMatches, int drawMatches, int loseMatches, int scorePoint, int losePoint, int differenceBetweenGainsAndLosses, int point, int matchesNum) {
        this.winMatches = winMatches;
        this.drawMatches = drawMatches;
        this.loseMatches = loseMatches;
        this.scorePoint = scorePoint;
        this.losePoint = losePoint;
        this.differenceBetweenGainsAndLosses = differenceBetweenGainsAndLosses;
        this.point = point;
        this.matchesNum = matchesNum;
    }

    public TeamMatchRecord(String teamName, int winMatches, int drawMatches, int loseMatches, int scorePoint, int losePoint, int differenceBetweenGainsAndLosses, int point, int matchesNum) {
        super(teamName);
        this.winMatches = winMatches;
        this.drawMatches = drawMatches;
        this.loseMatches = loseMatches;
        this.scorePoint = scorePoint;
        this.losePoint = losePoint;
        this.differenceBetweenGainsAndLosses = differenceBetweenGainsAndLosses;
        this.point = point;
        this.matchesNum = matchesNum;
    }

    public int getWinMatches() {
        return winMatches;
    }

    public void setWinMatches(int winMatches) {
        this.winMatches = winMatches;
        winMatches++;
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

    public int getScorePoint() {
        return scorePoint;
    }

    public void setScorePoint(int scorePoint) {
        this.scorePoint = scorePoint;
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

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getMatchesNum() {
        return matchesNum;
    }

    public void setMatchesNum(int matchesNum) {
        this.matchesNum = matchesNum;
    }

    public void incrementMatchesNum() {
        this.matchesNum++;
    }

    public int sumDifferenceBetweenGainsAndLosses(int scorePoint, int losePoint) {
        return scorePoint - losePoint;
    }


}
