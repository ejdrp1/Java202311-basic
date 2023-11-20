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

        GroupStageView.introSetGroupStageTeamInfo(groupA); // 조 편성 msg
        repeatGroupStageProgress(groupA, teamMatchRecord);
    }

    private void repeatGroupStageProgress(List<Team> groupA, TeamMatchRecord teamMatchRecord) {
        GroupStageView.groupStageProgressInfo(groupA, teamMatchRecord); // 경기 진행 상황

        for (int i = 0; i < 6; i++) {
            groupStageProgress(groupA, teamMatchRecord);
        }
    }

    private void groupStageProgress(List<Team> groupA, TeamMatchRecord teamMatchRecord) {
//        GroupStageView.nextMatchesInfo(); // 경기 진행 msg
        inputTeamScore(groupA, teamMatchRecord);
    }

    private void inputTeamScore(List<Team> groupA, TeamMatchRecord teamMatchRecord) {
//      1. 팀 스코어 입력
        teamMatchRecord.incrementMatchesNum(); // 경기수 증가


//      2. 경기 승 무 패 count 조건식 + 득실차 + 승점

//        endMatchesRound(teamMatchRecord); // 경기 종료 후
    }





//    private void endMatchesRound(TeamMatchRecord teamMatchRecord) {
//        teamMatchRecord.incrementMatchesNum(); // 경기수 증가
//        GroupStageView.endMatchesRoundInfo(teamMatchRecord); // 라운드 종료 msg
//    }


}
