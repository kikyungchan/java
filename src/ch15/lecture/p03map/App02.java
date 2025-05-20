package ch15.lecture.p03map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("java", "spring");
        map.put("python", "django");
        map.put("js", "node");

        //keySet으로 전체탐색
        System.out.println("--키셋--");
        for (String key : map.keySet()) {
            String v = map.get(key);
            System.out.println(key + " : " + v);
        }

        //entrySet으로 전체탐색
        System.out.println("--엔드리셋--");
//        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " + value);
        }
        // forEach메소드
        System.out.println("--포이치--");
        map.forEach((k, v) -> System.out.println(k + ":" + v));
        //
        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(1, 1 + 1);
        System.out.println("map1 = " + map1);
        for (Integer key : map1.keySet()) {
            Integer v = map1.get(key);
            System.out.println(key + " : " + v);
        }
    }
}
