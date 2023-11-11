package level0.play.PositionInfoService.Model;

public class Forward {

    AbilityValue abilityValue = new AbilityValue();

    //    중앙
    private String poacher;
    private String targetForward;
    private String advancedForward;
    private String deepLyingForward;
    private String completeForward;
    private String pressingForward;
    private String shadowStriker;
    private String trequartista;
    //    측면
    private String winger;
    private String invertedWinger;
    private String insideForward;

    public Forward() {
    }

    public void poacher() {
        System.out.println("포처를 선택하셨습니다.");
        System.out.println("poacher의 역할은 주로 ~~입니다.");
        System.out.println("포처의 주요 능력치 : ");
        abilityValue.passing();
    }

}
