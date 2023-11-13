package level0.play.PlayerSalaryCalculator.Controller;

import level0.play.PlayerSalaryCalculator.Model.Player;

import java.util.Scanner;

public class ExampleController {
    Scanner scanner = new Scanner(System.in);

    public void startExample() {
        Player player = new Player();
        player.setName(scanner.next());
        player.setAge(scanner.nextInt());


        System.out.println("이름 : " + player.getName());
        System.out.println("나이 : " + player.getAge());

        System.out.println(plusStr(player));
    }



    private String plusStr(Player player) {
        return player.getName() + player.getAge();
    }
}
