package level1.basic;

import java.util.Arrays;
import java.util.Collections;

public class basic11 {
    public long solution(long n) {

        long answer = 0;

//        1. String 배열로 만들기 위해 n을 Long.toString()을 사용하여
//              String 으로 만들고 split()을 사용하여 배열로 만듬
        String[] str = Long.toString(n).split("");

//        2. Arrays.sort() : 오름차순
//              Arrays.sort(배열 변수 이름, Collections.reverseOrder()) : 내림차순
        Arrays.sort(str, Collections.reverseOrder());

//        3. 문자열 변수 answ에 담기
        String answ = "";
        for (String s : str) {
            answ += s;
        }

//        4. answ에 담긴 문자열을 long 형으로 변환
        answer = Long.parseLong(answ);

        return answer;

    }
}
