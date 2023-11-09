package level0;

public class basic24 {
    public int[] solution(int money) {

        int[] answer = new int[2];

        answer[0] = money / 5500;
        answer[1] = money % 5500;

        return answer;
    }

//    다른 풀이
    public int[] solution1(int money) {
        return new int[] {money / 5500, money % 5500};
    }
}
