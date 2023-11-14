package level1.basic;

public class basic13 {
    public long solution(int a, int b) {

        long answer = 0;

//        1. a가 b보다 작은 경우
        if (a <= b) {
//            a부터 b까지 순서대로 더함
            for (int i = a; i <= b; i++) {
                answer += i;
            }
//            a가 b보다 큰 경우
        } else {
//            b부터 a까지 순서대로 더함
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        }
        return answer;
    }

}
