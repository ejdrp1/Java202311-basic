package variableMethod.basic.teamOfRankingCalculator;

public class Ranking extends Team {

    private int differenceBetweenGainsAndLosses; // 득실차
    private int matches; // 경기 수


    public int differenceBetweenGainsAndLossesCalculator(int score, int losePoint) {
        return score - losePoint;
    }

    public Ranking(int winMatches, int drawMatches, int loseMatches, int score, int losePoint) {
        super(winMatches, drawMatches, loseMatches, score, losePoint);
    }
}
