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
        String userInputTeamName = scanner.next();
        String[] inputTeamNameArr = userInputTeamName.split(",");


        for (int i = 0; i < inputTeamNameArr.length; i++) {
            teamList = new ArrayList<>();
            team = new Team(inputTeamNameArr[i]);
            System.out.println(team.getTeamName());
        }


    }
}
