package ch15.exercise.p09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            int score = map.get(key);
            totalScore += score;
            if (score > maxScore) {
                maxScore = score;
                name = key;

            }
        }
        double average = (double) totalScore / map.size();
        System.out.println("average = " + average);
        System.out.println("maxScore = " + maxScore);
        System.out.println("name = " + name);


    }
}
