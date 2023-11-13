package level0.play.PlayerSalaryCalculator.Controller;

import level0.play.PlayerSalaryCalculator.View.PlayerSalaryView;

import java.util.Scanner;

public class PlayerSalaryController {
    public static Scanner scanner = new Scanner(System.in);


    public void selectPlayerSalaryType(int playerSalaryType) {
        switch (playerSalaryType) {
            case 1:
                System.out.println("주급 선택");
                break;
            case 2:
                System.out.println("연봉 선택");
                break;
        }
    }


}
