package level1.basic;

import java.util.Arrays;

public class basic04 {
    public double solution(int[] arr) {

        double answer = 0;
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            answer = sum / arr.length;
        }

        return answer;
    }

    //    다른 풀이
    public double solution1(int[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }
}
