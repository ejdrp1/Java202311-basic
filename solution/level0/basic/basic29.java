package level0.basic;

public class basic29 {
    public int solution(String str1, String str2) {

        return  (str1.contains(str2)) ? 1 : 2;

    }

//    contains() : 특정 문자열이 포함되어 있는지 확인하는 메서드
//    있다면 true, 없다면 false를 반환

//    contains()와 equals()의 차이점
//    두 문자열이 같은가? : equals();
//    단, equals()는 주소값이 다르더라도 안에 담긴 문자열을 비교하는 것이므로 같은 내용이면 true를 반환함
//    문자열을 정확하게 비교하기 위해서는 equals()를 사용해야 함
}
