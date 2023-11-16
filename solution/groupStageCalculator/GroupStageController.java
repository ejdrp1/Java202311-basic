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
        String participateTeams = scanner.next();
        String[] participateTeamsArr = participateTeams.split(",");
        Team team;
        List<Team> groupA;

        for (int i = 0; i < participateTeamsArr.length; i++) {
            team = new Team();
            groupA = new ArrayList<>();

            for (int j = i; j <= i; j++) {
                team.setTeamName(participateTeamsArr[j]);
            }
            System.out.println(team.getTeamName());


        }
    }

}
