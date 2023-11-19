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
        GroupStageView.introSetGroupStageTeamInfo(groupA);
        repeatGroupStageProgress(groupA, teamMatchRecord);
    }

    private void repeatGroupStageProgress(List<Team> groupA, TeamMatchRecord teamMatchRecord) {
        GroupStageView.groupStageProgressInfo(groupA, teamMatchRecord); // 경기 진행 상황
        GroupStageView.introMatchesScheduleInfo(groupA);
        for (int i = 0; i < 6; i++) {
            groupStageProgress(groupA, teamMatchRecord);
        }
    }

    private void groupStageProgress(List<Team> groupA, TeamMatchRecord teamMatchRecord) {
        GroupStageView.nextMatchesInfo();
        inputTeamScore(groupA, teamMatchRecord);
    }

    private void inputTeamScore(List<Team> groupA, TeamMatchRecord teamMatchRecord) {
        teamMatchRecord.incrementMatchesNum();

        List<Ranking> ranking = new ArrayList<>();



        GroupStageView.endMatchesRoundInfo(teamMatchRecord);
//        경기 승 무 패 count 조건식 + 득실차 + 승점

    }


}
