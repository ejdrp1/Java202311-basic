package level1.basic;

import java.util.Arrays;

public class basic16 {
    public int[] solution(int[] arr, int divisor) {

        int count = 0;
        int number = 0;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                count++;
            }
        }

        if (count == 0) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[count];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[number] = arr[i];
                number++;
            }
        }
        return answer;
    }

    //    다른 풀이
    public int[] solution1(int[] arr, int divisor) {
//        filter()로 divisor 로 나누어지는 값만 answer 배열에 저장
        int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();

//        answer 배열의 길이가 0이면(나누어지는 값이 없다면)
        if (answer.length == 0) {
            answer = new int[]{-1}; // 배열을 생성하고 초기값을 -1로 지정
        }

//        answer 배열 오름차순 정렬
        Arrays.sort(answer);

        return answer;
    }
}
