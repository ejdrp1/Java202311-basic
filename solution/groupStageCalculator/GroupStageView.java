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

    public static void groupStageProgressInfo(List<Team> groupA) {
        System.out.println();
        System.out.println("A조 진행 상황");
        System.out.println("순위" + " | " + " 팀명 " + " | " + "경기수" + " | " + " 승 " + " | " + " 무 " + " | " + " 패 " + " | " + " 득점 " + " | " + " 실점 " + " | " + " 득실차 " + " | " + " 승점");
        System.out.println("   " + 1 + " | " + groupA.get(0).getTeamName() + " |   " + 0 + "      " + 0 + "      " + 0 + "      " + 0 + "      " + 0 + "        " + 0 + "        " + 0 + "        " + 0);
        System.out.println("   " + 2 + " | " + groupA.get(1).getTeamName() + " |   " + 0 + "      " + 0 + "      " + 0 + "      " + 0 + "      " + 0 + "        " + 0 + "        " + 0 + "        " + 0);
        System.out.println("   " + 3 + " | " + groupA.get(2).getTeamName() + " |   " + 0 + "      " + 0 + "      " + 0 + "      " + 0 + "      " + 0 + "        " + 0 + "        " + 0 + "        " + 0);
        System.out.println("   " + 4 + " | " + groupA.get(3).getTeamName() + " |   " + 0 + "      " + 0 + "      " + 0 + "      " + 0 + "      " + 0 + "        " + 0 + "        " + 0 + "        " + 0);
    }


    public static void playMatchesInfo() {
        System.out.println();
        System.out.println("첫번째 경기가 진행됩니다.");
    }

    public static void inputFirstMatchesInfo() {
        System.out.println();
        System.out.println("첫번째 경기 스코어를 입력해주세요.");
    }

    public static void introMatchesInfo(List<Team> groupA) {
        System.out.println();
        System.out.println("Match1. " + groupA.get(0).getTeamName() + " : " + groupA.get(1).getTeamName());
    }

    public static void inputFirstTeamScore(List<Team> groupA) {
        System.out.print("'" + groupA.get(0).getTeamName() + "'" + "의 스코어 입력 : ");
    }

    public static void inputSecondTeamScore(List<Team> groupA) {
        System.out.print("'" + groupA.get(1).getTeamName() + "'" + "의 스코어 입력 : ");
    }

    public static void resultFirstMatchesInfo(int firstTeamMatchesScore, int secondTeamMatchesScore, List<Team> groupA, TeamMatchRecord teamMatchRecord) {
        System.out.println();
        System.out.println("A조 진행 상황");
        System.out.println("순위" + " | " + " 팀명 " + " | " + "경기수" + " | " + " 승 " + " | " + " 무 " + " | " + " 패 " + " | " + " 득점 " + " | " + " 실점 " + " | " + " 득실차 " + " | " + " 승점");
        System.out.println("   " + 1 + " | " + groupA.get(0).getTeamName() + " |   " + 0 + "      " + teamMatchRecord.getWinMatches() + "      " + teamMatchRecord.getDrawMatches() + "      " + teamMatchRecord.getLoseMatches() + "      " + firstTeamMatchesScore + "        " + secondTeamMatchesScore + "        " + teamMatchRecord.sumDifferenceBetweenGainsAndLosses(firstTeamMatchesScore, secondTeamMatchesScore) + "        " + teamMatchRecord.getPoint());
        System.out.println("   " + 2 + " | " + groupA.get(1).getTeamName() + " |   " + 0 + "      " + teamMatchRecord.getWinMatches() + "      " + teamMatchRecord.getDrawMatches() + "      " + teamMatchRecord.getLoseMatches() + "      " + secondTeamMatchesScore + "        " + firstTeamMatchesScore + "        " + teamMatchRecord.sumDifferenceBetweenGainsAndLosses(firstTeamMatchesScore, secondTeamMatchesScore) + "        " + teamMatchRecord.getPoint());
        System.out.println("   " + 3 + " | " + groupA.get(2).getTeamName() + " |   " + 0 + "      " + 0 + "      " + 0 + "      " + 0 + "      " + 0 + "        " + 0 + "        " + 0 + "        " + 0);
        System.out.println("   " + 4 + " | " + groupA.get(3).getTeamName() + " |   " + 0 + "      " + 0 + "      " + 0 + "      " + 0 + "      " + 0 + "        " + 0 + "        " + 0 + "        " + 0);
    }
}