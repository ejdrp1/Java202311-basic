package variableMethod.basic.teamOfRankingCalculator;

import java.util.Scanner;

public class TeamRankingController {

    Scanner scanner = new Scanner(System.in);

    public void startProgram() {
        TeamRankingView.startTeamRankingCalculator();
        TeamRankingView.inputSelectStartProgramNum();
        int selectStartingNum = scanner.nextInt();
        selectStartingNum(selectStartingNum);
    }

    private void selectStartingNum(int selectNum) {
        switch (selectNum) {
            case 1:
                TeamRankingView.inputTeamInfo();
                break;
            case 2:
                TeamRankingView.endProgram();
                return;
        }
    }
}
