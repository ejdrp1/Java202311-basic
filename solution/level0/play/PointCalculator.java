package level0.play;

public class PointCalculator {

    public int calculator(int winCount, int drawCount) {

        int winPoint = winCount * 3; // 승 : 3점

        return winPoint + drawCount;
    }

    public static void main(String[] args) {
        PointCalculator pointCalculator = new PointCalculator();
        System.out.println(pointCalculator.calculator(5, 3));
    }
}
