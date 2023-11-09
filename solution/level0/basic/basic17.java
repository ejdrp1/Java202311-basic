package level0.basic;

public class basic17 {
    public String solution(String my_string, String letter) {

        String answer = "";

        answer = my_string.replace(letter, "");

        return answer;

//        replace : 문자열을 치환하는 메서드
//        obj.replace(기존 문자, 바꿀 문자);

//        replaceAll : 바꾸고 싶은 모든 문자열을 전부 치환하는 메서드

//        replace와 replaceAll의 차이점
//        replace의 첫번째 값으로는 바꿀 문자열을 입력받는 대신에
//        replaceAll의 첫번째 값으로는 정규식이 들어간다.
//        그래서 정규식 특성상 특수문자가 포함된 것을 바꿀 때에는
//        replaceAll이 아닌 replace를 사용하여 문자 치환을 할 수 있다.

    }
}
