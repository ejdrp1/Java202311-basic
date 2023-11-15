package variableMethod.basic.teamOfRankingCalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
                TeamRankingView.inputTeamText();
                inputTeamName();
                break;
            case 2:
                TeamRankingView.endProgram();
                return;
        }
    }

    private void inputTeamName() {

        Team team = null;
        List<Team> teamList = null;




    }
}
