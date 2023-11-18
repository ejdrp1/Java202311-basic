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
        GroupStageView.groupStageProgressInfo(groupA, teamMatchRecord);
        teamMatchRecord.setMatchesNum(0);
        test(groupA, teamMatchRecord);
    }

    private void test(List<Team> groupA, TeamMatchRecord teamMatchRecord) {

        GroupStageView.groupStageProgressInfo(groupA, teamMatchRecord);
    }

    public void test() {

    }


}
