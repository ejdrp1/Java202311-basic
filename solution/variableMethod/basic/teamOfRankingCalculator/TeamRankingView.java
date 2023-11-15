package variableMethod.basic.teamOfRankingCalculator;

public class TeamRankingView {

    public static void startTeamRankingCalculator() {
        System.out.println("안녕하세요! 미니 축구 최종 기록/순위 계산기입니다.");
        System.out.println("총 7개 팀의 승점을 비교하여 순위가 정해집니다.");
        System.out.println("1위, 2위 : 챔피언스리그");
        System.out.println("3위, 4위 : 유로파리그");
        System.out.println("5위 : 컨퍼런스리그");
        System.out.println("6위 : 무관");
        System.out.println("7위 : 강등");
        System.out.println();
    }

    public static void inputSelectStartProgramNum() {
        System.out.println("시작은 1번, 종료는 2번을 입력해주세요.");
    }

    public static void inputTeamText() {
        System.out.println("7개의 팀을 한줄로 입력해주세요. ( 예시) A팀, B팀,... G팀 )");
    }

    public static void endProgram() {
        System.out.println("감사합니다! 프로그램을 종료합니다!");
    }
}
