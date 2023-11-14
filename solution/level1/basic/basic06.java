package level1.basic;

import java.util.Locale;

public class basic06 {
    boolean solution(String s) {

        boolean answer = true;
        int pCount = 0;
        int yCount = 0;

//        toLowerCase() : 모두 소문자로 변경
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'p') {
                pCount++;
            } else if (c == 'y') {
                yCount++;
            }
        }
        answer = pCount == yCount ? true : false;

        return answer;
    }
}
