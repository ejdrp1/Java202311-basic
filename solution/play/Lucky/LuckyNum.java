package play.Lucky;

import java.util.HashMap;
import java.util.Map;

public class LuckyNum {
    public static void main(String[] args) {
        // Map에 1, 2, 3을 넣어놓고, 1.8% 확률로 1을 뽑기 위한 확률 설정
        Map<Integer, Double> probabilityMap = new HashMap<>();
        probabilityMap.put(1, 0.018); // 1.8% 확률
        probabilityMap.put(2, 0.5);   // 50% 확률
        probabilityMap.put(3, 0.482); // 48.2% 확률

        int result = getRandomWithProbability(probabilityMap);
        System.out.println("Randomly selected number: " + result);
    }

    private static int getRandomWithProbability(Map<Integer, Double> probabilityMap) {
        double rand = Math.random(); // 0.0부터 1.0 사이의 난수 생성

        for (Map.Entry<Integer, Double> entry : probabilityMap.entrySet()) {
            rand -= entry.getValue();
            if (rand <= 0.0) {
                return entry.getKey();
            }
        }

        // 위의 확률 맵이 제대로 설정되지 않았을 때 기본값으로 0을 반환하거나 예외 처리를 수행할 수 있습니다.
        throw new RuntimeException("Probability map is not properly configured");
    }
}
