package level1.basic;

public class basic01 {

    public int solution(int n) {

        int answer = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }

}
