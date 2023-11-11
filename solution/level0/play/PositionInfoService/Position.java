package level0.play.PositionInfoService;

import java.util.Scanner;

public class Position {
    public static Scanner scanner = new Scanner(System.in);

    public void startPositionInfoService() {
        System.out.println("안녕하세요. 축구 포지션 정보 서비스입니다!");
        System.out.println("1.시작하기 2.종료하기");
        int selectStartingNum = scanner.nextInt();
        selectStartingNum(selectStartingNum);
    }

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
                System.out.println("공격수입니다.");
                break;
            case 2:
                System.out.println("미드필더입니다.");
                break;
            case 3:
                System.out.println("수비수입니다.");
                break;
            case 4:
                System.out.println("골키퍼입니다.");
                break;
        }
    }


}
