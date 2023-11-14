package level1.basic;

public class basic09 {
    public int solution(int n) {
        int answer = 0;

//        1. int -> String
        String s = String.valueOf(n);

//        2. split() 메서드 사용하기 위해 StringBuilder 사용
        StringBuilder sb = new StringBuilder(s);

//        3. split("")으로 한 글자씩 나누고 배열에 담기
        String[] strArr = sb.toString().split("");

//        4. strArr의 배열에 인덱스 요소를 정수형으로 변환하여 answer에 담기
        for (int i = 0; i < sb.length(); i++) {
            answer += Integer.parseInt(strArr[i]);
        }

        return answer;
    }
}
