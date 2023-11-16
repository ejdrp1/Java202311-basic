package groupStageCalculator;

import java.util.Arrays;
import java.util.Scanner;

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
        GroupStageView.reconfirmParticipateTeamInfo(Arrays.toString(participateTeamsArr));
        assignedGroupStageTeam(Arrays.toString(participateTeamsArr));
    }

    private void assignedGroupStageTeam(String teams) {
        GroupStageView.introAssignedGroupStageTeamInfo(teams);
        proceedGroupStage();
    }

    private void proceedGroupStage() {

    }
}
