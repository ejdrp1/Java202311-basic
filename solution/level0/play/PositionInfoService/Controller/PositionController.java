package level0.play.PositionInfoService.Controller;

import java.util.Scanner;

public class PositionController {

    public static Scanner scanner = new Scanner(System.in);

    public void selectStartingNum(int selectStartingNum) {
        if (selectStartingNum == 1) {
            System.out.println("궁금하신 포지션을 입력해주세요!");
            selectPositionTypeTitleNum();
        } else {
            System.out.println("이용해주셔서 감사합니다! ( _ _ )");
            return;
        }
    }

    public void selectPositionTypeTitleNum() {
        System.out.println("1.공격수 2.미드필더 3.수비수 4.골키퍼");
        int selectPositionTypeNum = scanner.nextInt();
        selectPositionTypeNum(selectPositionTypeNum);
    }

    private void selectPositionTypeNum(int selectPositionTypeNum) {
        if (0 < selectPositionTypeNum && selectPositionTypeNum < 5) {
            selectedPositionTypeNum(selectPositionTypeNum);
        } else {
            System.out.println("옳바르지 않은 번호입니다. 다시 입력해주세요");
            selectPositionTypeTitleNum();
        }
    }

    public void selectedPositionTypeNum(int selectPositionTypeNum) {
        switch (selectPositionTypeNum) {
            case 1:
                selectForward();
                break;
            case 2:
                selectMidFielder();
                break;
            case 3:
                selectDefender();
                break;
            case 4:
                selectGoalKeeper();
                break;
        }
    }

//    1. 공격수
    public void selectForward() {
        System.out.println("공격수를 선택하셨습니다.");
    }

//    2. 미드필더
    public void selectMidFielder() {
        System.out.println("미드필더를 선택하셨습니다.");
    }

//    3.수비수
    public void selectDefender() {
        System.out.println("수비수를 선택하셨습니다.");
    }

//    4.골키퍼
    public void selectGoalKeeper() {
        System.out.println("골키퍼를 선택하셨습니다.");
    }

}
