package level0;

public class basic04 {
    public int solution(int num1, int num2) {
        return (0 <= num1 && num1 <= 10000) && (0 <= num2 && num2 <= 10000) && num1 == num2 ? 1 : -1;
    }
}
