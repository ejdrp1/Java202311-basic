package level0;

import java.util.Arrays;

public class basic20 {
    public int solution(int[] array) {

        Arrays.sort(array);

        int answer = array[array.length / 2];

        return answer;

    }

}
