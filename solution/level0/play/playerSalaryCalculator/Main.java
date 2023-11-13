package level0.play.playerSalaryCalculator;

import level0.play.playerSalaryCalculator.controller.ExampleController;
import level0.play.playerSalaryCalculator.controller.PlayerSalaryController;

public class Main {
    public static void main(String[] args) {

        PlayerSalaryController playerSalaryController = new PlayerSalaryController();
//        playerSalaryController.startPlayerSalaryCalculator();

        ExampleController exampleController = new ExampleController();
        exampleController.startExample();
    }
}
