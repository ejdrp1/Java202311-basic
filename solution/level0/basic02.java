package level0;

public class basic02 {
    public int solution(int num1, int num2) {
        return (-50000 <= num1 && num1 <= 50000) && (-50000 <= num2 && num2 <= 50000) ? num1 - num2 : 0;
    }
}
