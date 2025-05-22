package 자습.p20250520;

import java.util.*;

public class App01 {
    public List<Integer> findTriplicates(int[] nums) {
        // 각 숫자가 등장한 횟수를 기록할 Map
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // 1. 배열을 탐색하여 중복 횟수 세기
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // 2. 중복된 값들 중에서 정확히 3번 나온 값만 result 리스트에 추가
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 3) {
                result.add(entry.getKey());
            }
        }

        // 3. 결과를 오름차순으로 정렬
        Collections.sort(result);

        return result;
    }
}

