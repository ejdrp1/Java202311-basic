package level0.play.PlayerSalaryCalculator.Controller;

import level0.play.PlayerSalaryCalculator.View.PlayerSalaryView;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlayerSalaryController {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat formatter = new DecimalFormat("###,###");
    PlayerSalaryView playerSalaryView = new PlayerSalaryView();

    public void startPlayerSalaryCalculator() {
        playerSalaryView.startPlayerSalaryCalculator();
        playerSalaryView.inputPlayerName();
        inputPlayerName();
    }

    public void inputPlayerName() {
        String playerName = scanner.next();
        playerSalaryView.selectSalaryType();
        selectSalaryTypeOfPlayer(playerName);
    }

    private void selectSalaryTypeOfPlayer(String playerName) {
        int selectSalaryTypeNum = scanner.nextInt();
        verificationSalaryType(selectSalaryTypeNum, playerName);
    }

    private void verificationSalaryType(int salaryTypeNum, String playerName) {
        switch (salaryTypeNum) {
            case 1:
                playerSalaryView.selectWeeklyPayOfPlayer();
                inputWeeklyPayOfPlayer(playerName);
                break;
            case 2:
                playerSalaryView.selectAnnualIncomeOfPlayer();
                inputAnnualIncomeOfPlayer(playerName);
                break;
        }
    }


    private void inputWeeklyPayOfPlayer(String playerName) {
        long weeklyPay = scanner.nextLong();
        weeklyPayToAnnualIncome(weeklyPay, playerName);
    }

    private void weeklyPayToAnnualIncome(long weeklyPay, String playerName) {
        long weeklyPayCalculator = weeklyPay * 52;
        String result = formatter.format(weeklyPayCalculator);
        playerSalaryView.resultWeeklyPayToAnnualIncome(result, playerName);
    }

    private void inputAnnualIncomeOfPlayer(String playerName) {
        long AnnualIncome = scanner.nextLong();
        annualIncomeToWeeklyPay(AnnualIncome, playerName);
    }

    private void annualIncomeToWeeklyPay(long annualIncome, String playerName) {
        long annualIncomeCalculator = annualIncome / 52;
        String result = formatter.format(annualIncomeCalculator);
        playerSalaryView.resultAnnualIncomeToWeeklyPay(result, playerName);
    }

}
