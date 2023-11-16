package groupStageCalculator;

import java.util.List;

public class GroupStageView {

    public static void introProgramInfo() {
        System.out.println();
        System.out.println("안녕하세요! 축구 조별리그 시뮬레이터입니다.");
        System.out.println("경기 결과에 따라 여러가지 경우의 수를 계산해보는 프로그램입니다.");
        System.out.println("총 4개의 팀이 1개의 조에 편성됩니다.");
    }

    public static void selectStartingNumInfo() {
        System.out.println();
        System.out.println("1.시작하기 2.종료하기");
        System.out.print("입력 : ");
    }

    public static void selectProgramEnd() {
        System.out.println();
        System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
    }

    public static void inputTeamNameInfo() {
        System.out.println();
        System.out.println("참가할 4개의 팀을 적어주세요. ( ex.팀1, 팀2, 팀3, 팀4 )");
        System.out.print("입력 : ");
    }

    public static void introSetGroupStageTeamInfo(List<Team> groupA) {
        System.out.println();
        System.out.println("'" + groupA.get(0).getTeamName() + "', '" +
                groupA.get(1).getTeamName() + "', '" +
                groupA.get(2).getTeamName() + "', '" +
                groupA.get(3).getTeamName() + "'" +
                " 팀이 A조에 편성되었습니다.");
    }

    public static void groupStageInfo(List<Team> groupA) {
        System.out.println();
        System.out.println("A조 진행 상황");
        System.out.println("순위" + " | " + "팀명" + " | " + "경기수" + " | " + "승" + " | " + "무" + " | " + "패" + " | " + "득점" + " | " + "실점" + " | " + "득실차" + " | " + "승점");

    }
}
