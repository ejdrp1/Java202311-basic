package level0.play.positionInfoService.Controller;

import level0.play.positionInfoService.Model.Forward;

import java.util.Scanner;

public class PositionController {

    public static Scanner scanner = new Scanner(System.in);
    Forward forward = new Forward();

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
                System.out.println("공격수를 선택하셨습니다. 포지션 지역을 입력해주세요.");
                selectForward();
                break;
            case 2:
                System.out.println("미드필더를 선택하셨습니다. 포지션 지역을 입력해주세요.");
                selectMidFielder();
                break;
            case 3:
                System.out.println("수비수를 선택하셨습니다. 포지션 지역을 입력해주세요.");
                selectDefender();
                break;
            case 4:
                System.out.println("골키퍼를 선택하셨습니다. 포지션 지역을 입력해주세요.");
                selectGoalKeeper();
                break;
        }
    }

    //    1. 공격수
    public void selectForward() {
        selectLocationOfMidAndSide();
        int locationOfForwardNum = scanner.nextInt();
        selectLocationOfForward(locationOfForwardNum);
    }

    //    2. 미드필더
    public void selectMidFielder() {
        selectLocationOfMidAndSide();
        int locationOfMidFielderNum = scanner.nextInt();
    }

    //    3.수비수
    public void selectDefender() {
        selectLocationOfMidAndSide();
        int locationOfDefenderNum = scanner.nextInt();
    }

    //    4.골키퍼
    public void selectGoalKeeper() {
    }

    public void selectLocationOfMidAndSide() {
        System.out.println("1.중앙 2.측면");
    }

    public void selectLocationOfForward(int locationOfForwardNum) {
        if (0 < locationOfForwardNum && locationOfForwardNum < 3) {
            switch (locationOfForwardNum) {
                case 1:
                    selectForwardOfMid();
                    break;
                case 2:
                    selectForwardOfSide();
                    break;
            }
        } else {
            System.out.println("옳바르지 않은 번호입니다. 다시 입력해주세요");
            selectForward();
        }
    }

    public void selectForwardOfMid() {
        System.out.println("중앙 지역의 포워드를 선택하셨습니다. 원하시는 포지션을 입력해주세요.");
        System.out.println("1.포처 2.타겟형 포워드 3.딥 라잉 포워드 4.완성형 포워드 5.전진형 포워드 6.프레싱 포워드 7.트레콰르티스타");
        int forwardOfMidNum = scanner.nextInt();
        selectForwardOfMidNum(forwardOfMidNum);
    }

    public void selectForwardOfSide() {
        System.out.println("측면 지역의 포워드를 선택하셨습니다. 원하시는 포지션을 입력해주세요.");
        System.out.println("1.윙어 2.인사이드 포워드 3.인버티드 윙어");
        int forwardOfSideNum = scanner.nextInt();
        selectForwardOfSideNum(forwardOfSideNum);
    }

    public void selectForwardOfMidNum(int forwardOfMidNum) {
        switch (forwardOfMidNum) {
            case 1:
                selectPoacher();
                break;
            case 2:
                selectTargetMan();
                break;
            case 3:
                selectDeepLyingForward();
                break;
            case 4:
                selectCompleteForward();
                break;
            case 5:
                selectAdvancedForward();
                break;
            case 6:
                selectPressingForward();
                break;
            case 7:
                selectTrequartista();
                break;
        }
    }

    public void selectPoacher() {
        forward.poacher();

    }
    public void selectTargetMan() {
        System.out.println("타겟형 포워드를 선택하셨습니다.");
    }
    public void selectDeepLyingForward() {
        System.out.println("딥 라잉 포워드를 선택하셨습니다.");
    }
    public void selectCompleteForward() {
        System.out.println("완성형 포워드를 선택하셨습니다.");
    }
    public void selectAdvancedForward() {
        System.out.println("전진형 포워드를 선택하셨습니다.");
    }
    public void selectPressingForward() {
        System.out.println("프레싱 포워드를 선택하셨습니다.");
    }
    public void selectTrequartista() {
        System.out.println("트레콰르티스타를 선택하셨습니다.");
    }
















    public void selectForwardOfSideNum(int forwardOfSideNum) {

    }

}
