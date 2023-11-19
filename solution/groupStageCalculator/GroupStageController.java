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
        groupStageProgress(groupA);
    }

    private void groupStageProgress(List<Team> groupA) {
        TeamMatchRecord teamMatchRecord = new TeamMatchRecord();
        GroupStageView.groupStageProgressInfo(groupA, teamMatchRecord); // 경기 진행 상황
        GroupStageView.introMatchesScheduleInfo(groupA);
        GroupStageView.nextMatchesInfo();
        inputTeamScore(groupA, teamMatchRecord);
    }

    private void inputTeamScore(List<Team> groupA, TeamMatchRecord teamMatchRecord) {
//        경기 수 증가
        teamMatchRecord.incrementMatchesNum();
//        첫번째, 두번째 팀 경기
        GroupStageView.inputFirstTeamScoreInfo(groupA, teamMatchRecord);
        int sumFirstScorePoint = teamMatchRecord.accumulateScorePointNum(scanner.nextInt()); // 첫번째팀 득점
        teamMatchRecord.accumulateScorePointNum(sumFirstScorePoint);
        GroupStageView.inputSecondTeamScoreInfo(groupA, teamMatchRecord);
        int sumSecondScorePoint = teamMatchRecord.accumulateScorePointNum(scanner.nextInt()); // 두번째팀 득점 == 첫번째팀 실점
        teamMatchRecord.accumulateScorePointNum(sumSecondScorePoint);
        teamMatchRecord.accumulateLosePointNum(sumFirstScorePoint); // 두번째팀 실점
//        득실차
        teamMatchRecord.sumDifferenceBetweenGainsAndLosses(sumFirstScorePoint, sumSecondScorePoint);

        GroupStageView.inputThirdTeamScoreInfo(groupA, teamMatchRecord);
        int sumThirdScorePoint = teamMatchRecord.accumulateScorePointNum(scanner.nextInt());
        teamMatchRecord.accumulateScorePointNum(sumThirdScorePoint);
        GroupStageView.inputLastTeamScoreInfo(groupA, teamMatchRecord);
        int sumLastScorePoint = teamMatchRecord.accumulateScorePointNum(scanner.nextInt());
        teamMatchRecord.accumulateScorePointNum(sumLastScorePoint);
        teamMatchRecord.accumulateLosePointNum(sumThirdScorePoint);
        teamMatchRecord.sumDifferenceBetweenGainsAndLosses(sumThirdScorePoint, sumLastScorePoint);

        GroupStageView.endMatchesRoundInfo(teamMatchRecord);
//        경기 승 무 패 count 조건식 + 득실차 + 승점

        GroupStageView.endGroupStageProgressInfo(groupA, teamMatchRecord, sumFirstScorePoint, sumSecondScorePoint, sumThirdScorePoint, sumLastScorePoint);
    }


}
