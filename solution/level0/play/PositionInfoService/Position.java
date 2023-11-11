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
            System.out.println("1.공격수 2.미드필더 3.수비수 4.골키퍼");
        } else {
            System.out.println("이용해주셔서 감사합니다! ( _ _ )");
            return;
        }
    }

}
