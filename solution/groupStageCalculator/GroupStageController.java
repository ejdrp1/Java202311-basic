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
        teamMatchRecord.accumulateScorePointNum(1);
        teamMatchRecord.accumulateLosePointNum(2);
        GroupStageView.groupStageProgressInfo(groupA, teamMatchRecord);
        teamMatchRecord.incrementMatchesNum();
        testOne(groupA, teamMatchRecord);
    }

    private void testOne(List<Team> groupA, TeamMatchRecord teamMatchRecord) {
        teamMatchRecord.accumulateScorePointNum(3);
        teamMatchRecord.accumulateLosePointNum(1);
        GroupStageView.groupStageProgressInfo(groupA, teamMatchRecord);
        teamMatchRecord.incrementMatchesNum();
        testTwo(groupA, teamMatchRecord);
    }

    private void testTwo(List<Team> groupA, TeamMatchRecord teamMatchRecord) {
        teamMatchRecord.accumulateScorePointNum(4);
        teamMatchRecord.accumulateLosePointNum(1);
        teamMatchRecord.incrementMatchesNum();
        GroupStageView.groupStageProgressInfo(groupA, teamMatchRecord);
    }

}
