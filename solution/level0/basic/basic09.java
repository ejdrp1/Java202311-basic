package level0.basic;

public class basic09 {
    public int solution(int angle) {
        return (0 < angle && angle < 90) ? 1 : (angle == 90) ? 2 : (90 < angle && angle < 180) ? 3 : angle == 180 ? 4 : 0;
    }
}
