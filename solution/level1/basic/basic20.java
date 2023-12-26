package level1.basic;

import java.util.ArrayList;
import java.util.Arrays;

public class basic20 {
    public int[] solution(int[] arr) {

//        arr 배열 복사
        int[] temp = arr.clone();

//        복사한 배열의 최소값 찾기
        Arrays.sort(temp);
        int min = temp[0];

//        ArrayList 를 이용하여 최솟값과 같지 않은 수만 추가
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                list.add(arr[i]);
            }
        }

        int[] answer = {};
//       경우에 나눠서 배열에 값을 저장
        if (list.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        }
        return answer;
    }

}
