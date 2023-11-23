package groupStageCalculator.View;

import groupStageCalculator.Model.TeamMatchRecord;

import java.util.List;

public class GroupStageView {
    public static void introProgramInfo() {
        System.out.println();
        System.out.println("안녕하세요!");
        System.out.println("축구에서 경기 기록에 따라 결과를 순위로 출력해주는 프로그램입니다.");
        System.out.println("각 4개의 팀이 한 개의 조에 편성됩니다.");
    }

    public static void selectProgramStartNumInfo() {
        System.out.println();
        System.out.println("1.이어하기 2.종료하기");
        System.out.print("입력 : ");
    }

    public static void continueProgramInfo() {
        System.out.println();
        System.out.println("1.다시하기 2.종료하기");
        System.out.print("입력 : ");
    }

    public static void endProgramInfo() {
        System.out.println();
        System.out.println("프로그램이 종료됩니다. 이용해주셔서 감사합니다!");
    }

    public static void introTeamDataInfo() {
        System.out.println();
        System.out.println("팀 4개와 각 팀의 성적을 입력해주세요. (띄어쓰기 주의)");
        System.out.println("( ex. 팀이름, 경기수, 승, 무, 패, 득점, 실점 )");
        System.out.println("( ex. 토트넘,6,5,0,1,20,6 )");
    }

    public static void repeatIntroTeamDataInfo() {
        System.out.print("입력 : ");
    }

    public static void successRegisterTeamInfo() {
        System.out.println();
        System.out.println("입력하신 정보가 등록되었습니다.");
    }

    public static void groupStageFinallyResultInfo() {
        System.out.println();
        System.out.println("최종 결과 입니다!");
        System.out.println("순위" + " | " + " 팀명 " + " | " + "경기수" + " | " + " 승 " + " | " + " 무 " + " | " + " 패 " + " | " + " 득점 " + " | " + " 실점 " + " | " + " 득실차 " + " | " + " 승점");
    }

    public static void endGroupStageProgressInfo(List<TeamMatchRecord> groupA, int i) {
        System.out.println("   " + (i + 1) + " | "
                + groupA.get(i).getTeamName()
                + " |   " + groupA.get(i).getMatchesNum()
                + "      " + groupA.get(i).getWinMatches()
                + "      " + groupA.get(i).getDrawMatches()
                + "      " + groupA.get(i).getLoseMatches()
                + "      " + groupA.get(i).getScorePoint()
                + "        " + groupA.get(i).getLosePoint()
                + "        " + groupA.get(i).getDifferenceBetweenGainsAndLosses()
                + "        " + groupA.get(i).getPoint());
    }


}