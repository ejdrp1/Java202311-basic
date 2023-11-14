package level1.basic;

import java.util.Arrays;
import java.util.stream.Stream;

public class basic12 {
    public boolean solution(int x) {

        int num = x;
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return x % sum == 0 ? true : false;
    }


    //    다른 풀이
    public boolean solution1(int x) {
//        1. x를 문자열로 변환
        String[] tmp = String.valueOf(x).split("");
//        ex) x가 12이라면 : [1, 2]

//        2. 정수형으로 변환하여 합을 변수에 저장 반복
        int sum = 0;
        for (String s : tmp) {
            sum += Integer.parseInt(s); // sum = 1 + 2
        }

//        3. 하샤드의 조건 충족 확인
        return (x % sum == 0) ? true : false;


    }
}
