package level0.play.PlayerSalaryCalculator.View;

import level0.play.PlayerSalaryCalculator.Controller.PlayerSalaryController;

import java.util.Scanner;

public class PlayerSalaryView {

    PlayerSalaryController playerSalaryController = new PlayerSalaryController();
    public void startPlayerSalaryCalculator() {
        System.out.println("입력하신 선수의 급여를 계산하는 프로그램입니다!");
        System.out.println("선수의 이름과 주급 또는 연봉을 입력해주세요.");
        System.out.print("선수 이름 : ");
        playerSalaryController.inputPlayerName(playerSalaryController.scanner.next());



    }
}
