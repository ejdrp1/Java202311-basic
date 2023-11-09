package level0.basic;

public class basic27 {
    public int solution(int[] array, int n) {

        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                answer++;
            }
        }

        return answer;
    }

//    다른 풀이
    public int solution1(int[] array, int n) {

        int answer = 0;

        for (int num : array) {
            if (num == n) answer++;
        }

        return answer;
    }
}
