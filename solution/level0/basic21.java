package level0;

public class basic21 {
    public int solution(int[] array, int height) {

        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            if (height < array[i]) {
                answer++;
            }
        }

        return answer;

    }

    //    다른 풀이
    public int solution1(int[] array, int height) {

        int answer = 0;

        for (int i : array) {
            answer += (i > height) ? 1 : 0;
        }
        return answer;

    }

}
