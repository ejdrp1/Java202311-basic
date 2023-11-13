package level0.play.PlayerSalaryCalculator.View;

import level0.play.PlayerSalaryCalculator.Controller.PlayerSalaryController;

import java.util.Stack;

public class PlayerSalaryView {

    static PlayerSalaryController playerSalaryController = new PlayerSalaryController();

    public static void startPlayerSalaryCalculator() {
        System.out.println("입력하신 선수의 급여를 계산하는 프로그램입니다!");
        inputPlayerName();
    }

    public static void inputPlayerName() {
        System.out.println("선수의 이름을 입력해주세요.");
        System.out.print("선수 이름 : ");
        String playerName = playerSalaryController.scanner.next();
        inputPlayerSalary(playerName);
    }

    public static void inputPlayerSalary(String playerName) {
        System.out.println("'" + playerName + "'" + " 선수의 급여을 선택해주세요.");
        System.out.println("1.주급 2.연봉");
        System.out.print("입력 : ");
        int playerSalaryType = playerSalaryController.scanner.nextInt();
        playerSalaryController.selectPlayerSalaryType(playerSalaryType);
    }


    public void inputWeeklyOfPayPlayer() {
        System.out.print("주급 입력 : ");
        int weeklyPayOfPlayer = playerSalaryController.scanner.nextInt();
        PlayerSalaryController.weeklyPayOfPlayerCalculator(weeklyPayOfPlayer);
    }
    public void inputAnnualIncomePlayer() {
        System.out.print("연봉 입력 : ");
        long annualIncomeOfPlayer = playerSalaryController.scanner.nextLong();
        PlayerSalaryController.annualIncomeOfPlayerCalculator(annualIncomeOfPlayer);
    }

    public static void resultWeeklyPayOfAnnualIncome(int resultAnnualIncome) {
        System.out.println(resultAnnualIncome+"원");
    }
    public static void resultAnnualIncomeOfAnnualIncome(long resultWeeklyPay) {
        System.out.println(resultWeeklyPay+"원");
    }

}
