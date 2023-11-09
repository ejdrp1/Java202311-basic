package level0.play;

public class pointCalculator {

    public static int calculator(int winCount, int drawCount, int loseCount) {

        int winPoint = winCount * 3; // 승 : 3점
        int drawPoint = drawCount;  // 무 : 1점
        int losePoint = loseCount * 0;  // 패 : 0점
        int sum = winPoint + drawPoint + losePoint; // 총합

        return sum;
    }
    public static void main(String[] args) {
        System.out.println(calculator(10, 5, 0));
    }

}
