package level0.basic;

public class basic26 {
    public int solution(int n) {

        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer++;
            }
        }

        return answer;
    }
}
