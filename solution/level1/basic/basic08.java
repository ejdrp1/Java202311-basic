package level1.basic;

import java.util.stream.Stream;

public class basic08 {
    public int[] solution(long n) {

//        1. long -> String
        String s = String.valueOf(n); // String n;

//        2. reverse() 메소드를 이용하기 위해 StringBuilder 인스턴스 생성
        StringBuilder sb = new StringBuilder(s);

//        3.reverse()로 문자열 뒤집기
        sb = sb.reverse(); // [54321]

//        4. String.split("")로 한 글자씩 잘라 배열에 담기
        String[] strArr = sb.toString().split(""); // [5, 4, 3, 2, 1]

//        5. 문자열 길이 만큼 배열 길이 할당
        int[] answer = new int[sb.length()];

//        6. String -> int -> int[]
        for (int i = 0; i < sb.length(); i++) {
            answer[i] = Integer.parseInt(strArr[i]); // [5, 4, 3, 2, 1]
        }

        return answer;

    }

//    다른 풀이
    public int[] solution1(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
}
