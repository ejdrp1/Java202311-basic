package level0.play.PositionInfoService.Model;

public class Forward {

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
    AbilityValue abilityValue = new AbilityValue();

    public Forward() {
    }

    public void poacher() {
        System.out.println();
        System.out.println("포처를 선택하셨습니다.");
        System.out.println("포처의 역할은 주로 ~~입니다.");
        System.out.println();
        System.out.println("포처의 주요 능력치 : ");
        abilityValue.speed();
        abilityValue.moving();
        abilityValue.shooting();
        abilityValue.judgment();
        abilityValue.skill();
    }

}
