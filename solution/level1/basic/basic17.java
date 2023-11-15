package level1.basic;

import java.util.Arrays;

public class basic17 {
    public int solution(int[] numbers) {

        int answer = 0;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            answer = 45 - sum;
        }

        return answer;
    }

//    위의 코드 한 줄로 요약해보기
    public int solution1(int[] numbers) {
        return 45 - Arrays.stream(numbers).sum();
    }

}
