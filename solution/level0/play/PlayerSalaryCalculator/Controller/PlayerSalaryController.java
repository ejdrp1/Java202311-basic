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
                playerSalaryView.inputAnnualIncomePlayer();
                break;
        }
    }

    public static void weeklyPayOfPlayerCalculator(int weeklyPayOfPlayer) {
        int annualIncome = weeklyPayOfPlayer * 52;
        PlayerSalaryView.resultWeeklyPayOfAnnualIncome(annualIncome);
    }
    public static void annualIncomeOfPlayerCalculator(int annualIncomeOfPlayer) {
        int weeklyPay = (int)(annualIncomeOfPlayer / 52);
        PlayerSalaryView.resultAnnualIncomeOfAnnualIncome(weeklyPay);
    }
}
