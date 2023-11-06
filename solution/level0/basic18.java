package level0;

import java.lang.reflect.Array;
import java.util.Arrays;

public class basic18 {
    public int[] solution(String[] strlist) {

        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }

        return answer;
    }

//    다른 풀이 (stream)
    public int[] solution1(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }

//    mapToInt() : stream을 IntStream으로 변환해주는 메서드
//    map()은 연산의 결과로 stream 타입의 스트림을 반환함
//    stream의 요소를 숫자로 반환하는 경우 IntStream과 같은 기본형 Stream으로 반환하는 것이 더 유용함!

}


