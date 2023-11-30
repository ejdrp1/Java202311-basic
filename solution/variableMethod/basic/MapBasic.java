package variableMethod.basic;

import java.util.HashMap;
import java.util.Map;

public class MapBasic {

    public void mapBasicMethod() {
//    1. 선언
//    Map<자료형(key), 자료형(value)> 변수명 = new HashMap<>();
        Map<String, Integer> map = new HashMap<>();

//    2. put
        map.put("드록바", 10);
        map.put("램파드", 8);
        map.put("존테리", 26);
        map.put("체흐", 1);

        map.put("램파드", 18);
        map.put("체흐", 33);

        for (String key : map.keySet()) {
            System.out.println("key : " + key + ", value : " + map.get(key));
        }

    }


    public static void main(String[] args) {
        MapBasic mapBasic = new MapBasic();
        mapBasic.mapBasicMethod();
    }

}
