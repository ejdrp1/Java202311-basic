package level0.play.PlayerSalaryCalculator.View;

import level0.play.PlayerSalaryCalculator.Controller.PlayerSalaryController;

import java.util.Scanner;

public class PlayerSalaryView {

    PlayerSalaryController playerSalaryController = new PlayerSalaryController();

    public void startPlayerSalaryCalculator() {
        System.out.println("입력하신 선수의 급여를 계산하는 프로그램입니다!");
        inputPlayerName();
    }

    public void inputPlayerName() {
        System.out.println("선수의 이름을 입력해주세요.");
        System.out.print("선수 이름 : ");
        String playerName = playerSalaryController.scanner.next();
        inputPlayerSalary(playerName);
    }

    public void inputPlayerSalary(String playerName) {
        System.out.println("'" + playerName + "'" + " 선수의 급여을 선택해주세요.");
        System.out.println("1.주급 2.연봉");
        System.out.print("입력 : ");
        int playerSalaryType = playerSalaryController.scanner.nextInt();
        playerSalaryController.selectPlayerSalaryType(playerSalaryType);
    }


}
