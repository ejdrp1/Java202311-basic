package level0.play.PlayerSalaryCalculator.Controller;

import java.util.Scanner;

public class PlayerSalaryController {

    public static Scanner scanner = new Scanner(System.in);

    public void inputPlayerName(String inputPlayerName) {
        System.out.println("'" + inputPlayerName + "'" + "선수의 급여를 입력해주세요.");
    }

}
