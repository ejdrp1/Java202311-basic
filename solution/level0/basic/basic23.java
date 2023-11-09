package level0.basic;

public class basic23 {
    public int solution(int n) {

        int answer = 0;

        String str = Integer.toString(n);

        for (int i = 0; i < str.length(); i++) {
            answer += Integer.parseInt(str.substring(i, i + 1));
        }

        return answer;
    }

//    Integer.toString(int값) : int타입을 String타입으로 전환
//    또는 String.valueOf(int값)

//    Integer.valueOf(String값) : String타입을 int타입으로 전환
}
