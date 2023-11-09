package level0;

public class basic31 {
    public String solution(String my_string, int n) {

        String answer = "";

//      String타입 arr배열에 my_string을 .split을 이용하여 한 글자씩 나눠 담기
        String[] arr = my_string.split("");

//      String 객체 answer에 arr[i]로 한 글자씩 출력하고 .repeat(반복횟수)로 담아줌
        for (int i = 0; i < my_string.length(); i++) {
            answer += arr[i].repeat(n);
        }

        return answer;
    }

}
