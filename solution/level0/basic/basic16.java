package level0.basic;

public class basic16 {
    public String solution(String my_string) {

        String answer = "";

        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer += my_string.substring(i, i + 1);
        }

        return answer;
    }

//    StringBuilder
    public String solution1(String my_string) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.reverse();

        return sb.toString();
    }

}
