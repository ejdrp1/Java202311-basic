package level0;

public class basic01 {

    public int solution(int num1, int num2) {
        return (0 <= num1 && num1 <= 100) && (0 <= num2 && num2 <= 100) ? num1 * num2 : 0;
    }
}