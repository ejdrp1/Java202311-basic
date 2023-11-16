package groupStageCalculator;

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
        System.out.println("참가할 4개의 팀을 적어주세요. ( ex.팀1, 팀2, 팀3, 팀4)");
        System.out.print("팀 입력 : ");
    }
}
