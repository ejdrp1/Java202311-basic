package level0.play.positionInfoService.View;

import level0.play.positionInfoService.Controller.PositionController;

public class PositionView {

    PositionController positionController = new PositionController();


    public void startPositionInfoService() {
        System.out.println("안녕하세요. 축구 포지션 정보 서비스입니다!");
        System.out.println("1.시작하기 2.종료하기");
        int selectStartingNum = positionController.scanner.nextInt();
        positionController.selectStartingNum(selectStartingNum);
    }


}
