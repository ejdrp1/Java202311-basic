package level0;

import java.util.Arrays;

public class basic22 {
    public int solution(int[] sides) {

        Arrays.sort(sides);
        return sides[2] < sides[0] + sides[1] ? 1 : 2;

    }
}
