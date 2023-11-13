package level0.play.PlayerSalaryCalculator.Controller;

import level0.play.PlayerSalaryCalculator.View.PlayerSalaryView;

import java.util.Scanner;

public class PlayerSalaryController {
    Scanner scanner = new Scanner(System.in);
    PlayerSalaryView playerSalaryView = new PlayerSalaryView();

    public void startPlayerSalaryCalCulator() {
        playerSalaryView.startPlayerSalaryCalculator();
        playerSalaryView.inputPlayerName();
        inputPlayerName();
    }

    public void inputPlayerName() {
        String inputPlayerName = scanner.next();
        playerSalaryView.selectSalaryType();
        selectSalaryTypeOfPlayer();
    }

    private void selectSalaryTypeOfPlayer() {
        int selectSalaryTypeNum = scanner.nextInt();
        verificationSalaryType(selectSalaryTypeNum);
    }

    private void verificationSalaryType(int salaryTypeNum) {
        switch (salaryTypeNum) {
            case 1:
                playerSalaryView.selectWeeklyPayOfPlayer();
                break;
            case 2:
                break;
        }
    }

}