package level0.basic;

public class basic30 {
    public int solution(int price) {
        int answer = 0;
        if (price >= 500000) {
            answer = (int) (price * 0.8);
        } else if (price >= 300000) {
            answer = (int) (price * 0.9);
        } else if (price >= 100000) {
            answer = (int) (price * 0.95);
        } else  {
            answer = price;
        }
        return answer;
    }

//    다른 풀이
    public int solution1(int price) {
        return (int) (price >= 500000 ? price - price * 0.2 : price >= 300000 ? price - price * 0.1 : price >= 100000 ? price - price * 0.05 : price);
    }
}
