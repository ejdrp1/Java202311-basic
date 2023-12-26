package level1.basic;

public class basic19 {
     public String solution(String phone_number) {

         String answer = "";
         String encrypt = "*";

//         전화번호의 마지막 4자리
         String num = phone_number.substring(phone_number.length() - 4, phone_number.length());

//         전화번호의 마지막 4자리를 제외한 번호에 '*'로 대체
         answer += encrypt.repeat(phone_number.length() - 4);

//         번호 연결
         answer += num;

         return answer;

    }

}



