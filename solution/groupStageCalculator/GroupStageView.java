package groupStageCalculator;

public class GroupStageView {
    public static void introProgramInfo() {
        System.out.println();
        System.out.println("안녕하세요!");
        System.out.println("축구에서 경기 기록에 따라 결과를 순위로 출력해주는 프로그램입니다.");
        System.out.println("각 4개의 팀이 한 개의 조에 편성됩니다.");
    }

    public static void selectProgramStartNumInfo() {
        System.out.println();
        System.out.println("1.시작하기 2.종료하기");
        System.out.print("입력 : ");
    }

    public static void endProgramInfo() {
        System.out.println();
        System.out.println("프로그램이 종료됩니다. 이용해주셔서 감사합니다!");
    }

    public static void introTeamDataInfo() {
    }


//    public static void introSetGroupStageTeamInfo(List<Team> groupA) {
//        System.out.println();
//        System.out.println("'" + groupA.get(0).getTeamName() + "', '" +
//                groupA.get(1).getTeamName() + "', '" +
//                groupA.get(2).getTeamName() + "', '" +
//                groupA.get(3).getTeamName() + "'" +
//                " 팀이 A조에 편성되었습니다.");
//    }




//    public static void groupStageProgressInfo(List<Team> groupA, TeamMatchRecord teamMatchRecord) {
//        System.out.println();
//        System.out.println("A조 진행 상황 : " + teamMatchRecord.getMatchesNum() + ".Round");
//        System.out.println("순위" + " | " + " 팀명 " + " | " + "경기수" + " | " + " 승 " + " | " + " 무 " + " | " + " 패 " + " | " + " 득점 " + " | " + " 실점 " + " | " + " 득실차 " + " | " + " 승점");
//        System.out.println("   " + 1 + " | " + groupA.get(0).getTeamName() + " |   " + teamMatchRecord.getMatchesNum() + "      " + 0 + "      " + 0 + "      " + 0 + "      " + teamMatchRecord.getScorePoint() + "        " + teamMatchRecord.getLosePoint() + "        " + teamMatchRecord.sumDifferenceBetweenGainsAndLosses(teamMatchRecord.getScorePoint(), teamMatchRecord.getLosePoint()) + "        " + 0);
//        System.out.println("   " + 2 + " | " + groupA.get(1).getTeamName() + " |   " + teamMatchRecord.getMatchesNum() + "      " + 0 + "      " + 0 + "      " + 0 + "      " + teamMatchRecord.getScorePoint() + "        " + teamMatchRecord.getLosePoint() + "        " + teamMatchRecord.sumDifferenceBetweenGainsAndLosses(teamMatchRecord.getScorePoint(), teamMatchRecord.getLosePoint()) + "        " + 0);
//        System.out.println("   " + 3 + " | " + groupA.get(2).getTeamName() + " |   " + teamMatchRecord.getMatchesNum() + "      " + 0 + "      " + 0 + "      " + 0 + "      " + teamMatchRecord.getScorePoint() + "        " + teamMatchRecord.getLosePoint() + "        " + teamMatchRecord.sumDifferenceBetweenGainsAndLosses(teamMatchRecord.getScorePoint(), teamMatchRecord.getLosePoint()) + "        " + 0);
//        System.out.println("   " + 4 + " | " + groupA.get(3).getTeamName() + " |   " + teamMatchRecord.getMatchesNum() + "      " + 0 + "      " + 0 + "      " + 0 + "      " + teamMatchRecord.getScorePoint() + "        " + teamMatchRecord.getLosePoint() + "        " + teamMatchRecord.sumDifferenceBetweenGainsAndLosses(teamMatchRecord.getScorePoint(), teamMatchRecord.getLosePoint()) + "        " + 0);
//    }


//    public static void endGroupStageProgressInfo(List<Team> groupA, TeamMatchRecord teamMatchRecord, int sumFirstScorePoint, int sumSecondScorePoint, int sumThirdScorePoint, int sumLastScorePoint) {
//        System.out.println();
//        System.out.println("A조 진행 상황 : " + teamMatchRecord.getMatchesNum() + ".Round");
//        System.out.println("순위" + " | " + " 팀명 " + " | " + "경기수" + " | " + " 승 " + " | " + " 무 " + " | " + " 패 " + " | " + " 득점 " + " | " + " 실점 " + " | " + " 득실차 " + " | " + " 승점");
//        System.out.println("   " + 1 + " | " + groupA.get(0).getTeamName() + " |   " + teamMatchRecord.getMatchesNum() + "      " + teamMatchRecord.getWinMatches() + "      " + teamMatchRecord.getDrawMatches() + "      " + teamMatchRecord.getLoseMatches() + "      " + sumFirstScorePoint + "        " + sumSecondScorePoint + "        " + teamMatchRecord.sumDifferenceBetweenGainsAndLosses(sumFirstScorePoint, sumSecondScorePoint) + "        " + 0);
//        System.out.println("   " + 2 + " | " + groupA.get(1).getTeamName() + " |   " + teamMatchRecord.getMatchesNum() + "      " + teamMatchRecord.getWinMatches() + "      " + teamMatchRecord.getDrawMatches() + "      " + teamMatchRecord.getLoseMatches() + "      " + sumSecondScorePoint + "        " + sumFirstScorePoint + "        " + teamMatchRecord.sumDifferenceBetweenGainsAndLosses(sumSecondScorePoint, sumFirstScorePoint) + "        " + 0);
//        System.out.println("   " + 3 + " | " + groupA.get(2).getTeamName() + " |   " + teamMatchRecord.getMatchesNum() + "      " + teamMatchRecord.getWinMatches() + "      " + teamMatchRecord.getDrawMatches() + "      " + teamMatchRecord.getLoseMatches() + "      " + sumThirdScorePoint + "        " + sumLastScorePoint + "        " + teamMatchRecord.sumDifferenceBetweenGainsAndLosses(sumThirdScorePoint, sumLastScorePoint) + "        " + 0);
//        System.out.println("   " + 4 + " | " + groupA.get(3).getTeamName() + " |   " + teamMatchRecord.getMatchesNum() + "      " + teamMatchRecord.getWinMatches() + "      " + teamMatchRecord.getDrawMatches() + "      " + teamMatchRecord.getLoseMatches() + "      " + sumLastScorePoint + "        " + sumThirdScorePoint + "        " + teamMatchRecord.sumDifferenceBetweenGainsAndLosses(sumLastScorePoint, sumThirdScorePoint) + "        " + 0);
//    }















}