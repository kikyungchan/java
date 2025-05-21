package ch15.sec08;

import java.util.*;

public class ImmutableExample {
    public static void main(String[] args) {
        List<String> a = List.of("A", "B", "C");

        Set<String> a1 = Set.of("A", "B", "C");

        Map<Integer, String> a2 = Map.of(
                1, "A",

                
                2, "B",
                3, "C");

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        List<String> strings = List.copyOf(list);

        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        Set<String> strings1 = Set.copyOf(set);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        Map<Integer, String> map1 = Map.copyOf(map);

        String[] arr = {"A", "B", "C"};
        Arrays.asList(arr);
    }
}
