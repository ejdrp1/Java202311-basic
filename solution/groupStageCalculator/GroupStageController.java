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
        TeamMatchRecord teamMatchRecord = new TeamMatchRecord();
        String participateTeams = scanner.next();
        String[] participateTeamsArr = participateTeams.split(",");
        List<Team> groupA = new ArrayList<>(); // 조
        Team team;

        for (String teamNames : participateTeamsArr) {
            team = new Team();
            team.setTeamName(teamNames);
            groupA.add(team);
        }

        TeamIndexNum teamIndexNum = new TeamIndexNum();
        int[] teamIndex = {0, 1, 2, 3};
        teamIndexNum.setTeamIndexNum(teamIndex);


        GroupStageView.introSetGroupStageTeamInfo(groupA, teamIndex); // 조 편성 msg
        repeatGroupStageProgress(groupA, teamMatchRecord, teamIndex);
    }

    private void repeatGroupStageProgress(List<Team> groupA, TeamMatchRecord teamMatchRecord, int[] teamIndex) {
        GroupStageView.groupStageProgressInfo(groupA, teamMatchRecord); // 경기 진행 상황
//        GroupStageView.introMatchesScheduleInfo(groupA); // 경기 일정 msg
        for (int i = 0; i < 6; i++) {
            groupStageProgress(groupA, teamMatchRecord, teamIndex);
        }
    }

    private void groupStageProgress(List<Team> groupA, TeamMatchRecord teamMatchRecord, int[] teamIndex) {
//        GroupStageView.nextMatchesInfo(); // 경기 진행 msg
        inputTeamScore(groupA, teamMatchRecord, teamIndex);
    }

    private void inputTeamScore(List<Team> groupA, TeamMatchRecord teamMatchRecord, int[] teamIndex) {
//      1. 팀 스코어 입력
        teamMatchRecord.incrementMatchesNum(); // 경기수 증가

        teamIndexFirstChange(teamIndex);










//        inputTeamScoreNum(groupA, teamIndex); // 팀 스코어 입력



//      2. 경기 승 무 패 count 조건식 + 득실차 + 승점

//        endMatchesRound(teamMatchRecord); // 경기 종료 후
    }

    private void teamIndexFirstChange(int[] teamIndex) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < teamIndex.length; i++) {
            sb.append(teamIndex[i]).append(" ");
        }
        String teamIndexStr = sb.reverse().toString(); // 3 2 1 0
    }


    private void inputTeamScoreNum(List<Team> groupA, int[] teamIndex) {
        GroupStageView.inputFirstMatchesScoreNumInfo(groupA, teamIndex);
        String firstTeamScore = scanner.next();
        GroupStageView.inputSecondMatchesScoreNumInfo(groupA, teamIndex);
        String secondTeamScore = scanner.next();


    }

//    private void endMatchesRound(TeamMatchRecord teamMatchRecord) {
//        teamMatchRecord.incrementMatchesNum(); // 경기수 증가
//        GroupStageView.endMatchesRoundInfo(teamMatchRecord); // 라운드 종료 msg
//    }


}
