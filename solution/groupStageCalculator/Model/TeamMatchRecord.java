package groupStageCalculator.Model;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class TeamMatchRecord {

    private String teamName;
    private int winMatches = 0; // 승
    private int drawMatches = 0; // 무
    private int loseMatches = 0; // 패
    private int scorePoint = 0; // 득점
    private int losePoint = 0; // 실점
    private int differenceBetweenGainsAndLosses = 0; // 득실차
    private int point = 0; // 승점
    private int matchesNum = 0; // 경기수
    private int winPoints = 0;
    private int drawPoints = 0;
    private int losePoints = 0;
    private int comparePointResult = 0;


    public TeamMatchRecord() {
    }

    public TeamMatchRecord(String teamName, int winMatches, int drawMatches, int loseMatches, int scorePoint, int losePoint, int differenceBetweenGainsAndLosses, int point, int matchesNum, int winPoints, int drawPoints, int losePoints, int comparePointResult) {
        this.teamName = teamName;
        this.winMatches = winMatches;
        this.drawMatches = drawMatches;
        this.loseMatches = loseMatches;
        this.scorePoint = scorePoint;
        this.losePoint = losePoint;
        this.differenceBetweenGainsAndLosses = differenceBetweenGainsAndLosses;
        this.point = point;
        this.matchesNum = matchesNum;
        this.winPoints = winPoints;
        this.drawPoints = drawPoints;
        this.losePoints = losePoints;
        this.comparePointResult = comparePointResult;
    }

    public int getComparePointResult() {
        return comparePointResult;
    }

    public void setComparePointResult(int comparePointResult) {
        this.comparePointResult = comparePointResult;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
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

    public int sumDifferenceBetweenGainsAndLosses(int scorePoint, int losePoint) {
        differenceBetweenGainsAndLosses = scorePoint - losePoint;
        return differenceBetweenGainsAndLosses;
    }

    public void setWinPoints(int winMatches) {
        winPoints = winMatches * 3;
    }

    public int getWinPoints() {
        return winPoints;
    }

    public void setDrawPoints(int drawMatches) {
        drawPoints = drawMatches;
    }

    public int getDrawPoints() {
        return drawPoints;
    }

    public void setLosePoints(int loseMatches) {
        losePoints = loseMatches;
    }

    public int getLosePoints() {
        return 0;
    }


    public int pointCalculator(int winMatches, int drawMatches, int loseMatches) {
        setWinPoints(winMatches);
        setDrawPoints(drawMatches);
        setLosePoints(loseMatches);
        point = getWinPoints() + getDrawPoints() + getLosePoints();
        return point;
    }

    public void eachTeamsPoints(int[] eachTeamsPoint, List<TeamMatchRecord> groupA) {
        for (int i = 0; i < eachTeamsPoint.length; i++) {
            eachTeamsPoint[i] = groupA.get(i).getPoint();
        }
//        버블 정렬 알고리즘을 사용하여 배열 내림차순으로 정렬
        for (int i = 0; i < eachTeamsPoint.length - 1; i++) {
            for (int j = 0; j < eachTeamsPoint.length - 1 - i; j++) {
                if (eachTeamsPoint[j] < eachTeamsPoint[j + 1]) {
                    // 두 수를 교환
                    int temp = eachTeamsPoint[j];
                    eachTeamsPoint[j] = eachTeamsPoint[j + 1];
                    eachTeamsPoint[j + 1] = temp;
                }
            }
        }
    }


    public void eachTeamEnteredPoint(int[] eachPointResultArr, List<TeamMatchRecord> groupA, Map<TeamMatchRecord, Integer> matchingPoint) {

        for (int i = 0; i < groupA.size(); i++) {
            for (int j = 0; j < groupA.size() - 1; j++) {
//                승점 배열의 첫번째 index 값과 첫번째 팀의 승점이 다르다면
                if (groupA.get(j).getPoint() < groupA.get(j + 1).getPoint()) {
//                    첫번째팀과 두번째팀의 순서를 바꾼다.
                    TeamMatchRecord temp = groupA.get(j);
                    groupA.set(j, groupA.get(j + 1));
                    groupA.set(j + 1, temp);
                }
                matchingPoint.put(groupA.get(j), j + 1);
            }
        }

    }
}
