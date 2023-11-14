package level1.basic;

public class basic10 {
    public long solution(long n) {

        long answer = 0;

//        1. Math.sqrt() 함수를 이용하여 n의 제곱근을 변수 x에 담기
        Double x = Math.sqrt(n);

//        2. 실수형인 x의 값을 intValue() 메소드를 사용하면 x값을 정수 값으로 반환해준다.
        if (x == x.intValue()) {
//        Math.pow(n, 2); : n값의 2승을 double 형으로 반환
//        따라서 long 형으로 형변환 해줌
            answer = (long) Math.pow(x + 1, 2);
        } else {
//            3. 양의 정수가 아니라면 -1을 반환
            answer = -1;
        }
        return answer;
    }

//    다른 풀이
    public long solution1(long n) {

        if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }

        return -1;
    }

//    위의 코드 한줄로 만들어보기
    public long solution2(long n) {
        return (Math.pow((int)Math.sqrt(n), 2) == n) ? (long) Math.pow(Math.sqrt(n) + 1, 2) : -1;
    }
}
