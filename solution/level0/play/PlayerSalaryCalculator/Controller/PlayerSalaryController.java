package level0.play.PlayerSalaryCalculator.Controller;

import level0.play.PlayerSalaryCalculator.View.PlayerSalaryView;

import java.util.Scanner;

public class PlayerSalaryController {
    public static Scanner scanner = new Scanner(System.in);
    PlayerSalaryView playerSalaryView = new PlayerSalaryView();


    public void selectPlayerSalaryType(int playerSalaryType) {
        switch (playerSalaryType) {
            case 1:
                playerSalaryView.inputWeeklyOfPayPlayer();
                break;
            case 2:
                break;
        }
    }

    public static void weeklyPayOfPlayerCalculator(int weeklyPayOfPlayer) {

    }
}
