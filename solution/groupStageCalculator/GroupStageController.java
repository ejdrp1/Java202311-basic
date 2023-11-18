package groupStageCalculator;

import java.util.*;

public class GroupStageController {

    Scanner scanner = new Scanner(System.in);

    public void startProgram() {
        GroupStageView.introProgramInfo();
        GroupStageView.selectStartingNumInfo();
        int selectStartNum = scanner.nextInt();
        selectStartAndEndNum(selectStartNum);
    }

    private void selectStartAndEndNum(int selectStartAndEndNum) {
        switch (selectStartAndEndNum) {
            case 1:
                inputTeamName();
                break;
            case 2:
                GroupStageView.selectProgramEnd();
                return;
        }
    }

    private void inputTeamName() {
        GroupStageView.inputTeamNameInfo();
        setGroupStageTeam();
    }

    private void setGroupStageTeam() {
        String participateTeams = scanner.next();
        String[] participateTeamsArr = participateTeams.split(",");
        List<Team> groupA = new ArrayList<>(); // 조
        Team team;
        for (String teamNames : participateTeamsArr) {
            team = new Team();
            team.setTeamName(teamNames);
            groupA.add(team);
        }
        GroupStageView.introSetGroupStageTeamInfo(groupA);
        groupStage(groupA);
    }

    private void groupStage(List<Team> groupA) {
        Ranking ranking = new Ranking();
        TeamMatchRecord teamMatchRecord = new TeamMatchRecord();
        GroupStageView.groupStageProgressInfo(groupA);
        playFirstMatches(groupA);
    }

    private void playFirstMatches(List<Team> groupA) {
        GroupStageView.playMatchesInfo();
        GroupStageView.inputFirstMatchesInfo();
        GroupStageView.introMatchesInfo(groupA);
        GroupStageView.inputFirstTeamScore(groupA);
        int inputFirstTeamMatchesScore = scanner.nextInt();
        GroupStageView.inputSecondTeamScore(groupA);
        int inputSecondTeamMatchesScore = scanner.nextInt();
        inputFirstMatchesScore(inputFirstTeamMatchesScore, inputSecondTeamMatchesScore, groupA);
    }

    private void inputFirstMatchesScore(int firstTeamMatchesScore, int secondTeamMatchesScore, List<Team> groupA) {
        calculationFirstMatchesScore(firstTeamMatchesScore, secondTeamMatchesScore, groupA);
    }

    private void calculationFirstMatchesScore(int firstTeamMatchesScore, int secondTeamMatchesScore, List<Team> groupA) {
        TeamMatchRecord teamMatchRecord = new TeamMatchRecord();
        teamMatchRecord.setMatchNum(1);
        if (firstTeamMatchesScore > secondTeamMatchesScore) {
            teamMatchRecord.getWinMatches();
            teamMatchRecord.setWinMatches(1);
            teamMatchRecord.setPoint(3);
        } else if (firstTeamMatchesScore == secondTeamMatchesScore) {
            teamMatchRecord.getWinMatches();
            teamMatchRecord.setDrawMatches(1);
            teamMatchRecord.setPoint(1);
        } else {
            teamMatchRecord.getWinMatches();
            teamMatchRecord.setLoseMatches(1);
            teamMatchRecord.setPoint(0);
        }

        GroupStageView.resultFirstMatchesInfo(firstTeamMatchesScore, secondTeamMatchesScore, groupA, teamMatchRecord);
    }

    public void test() {

    }


}
