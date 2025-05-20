package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class App01 {
    public static void main(String[] args) {
        // set : 같은 객체를 여러번 저장할 수 없음
        //       탐색 순서가 보장되지 않음

        Set<String> set = new HashSet<>();
//        Set<Integer> set = new HashSet<>();
        //요소 추가
        set.add("하이");
        boolean spring = set.add("spring");
        System.out.println("spring = " + spring);
        set.add("html");
        System.out.println("set = " + set);
        set.add("css");
        System.out.println("set = " + set);
        boolean spring1 = set.add("spring");
        System.out.println("spring1 = " + spring1);
        System.out.println("set = " + set);
        set.add(null);
        System.out.println("set = " + set);
        set.add(null);
        System.out.println("set = " + set);

        //요소 삭제
        boolean spring2 = set.remove("spring");
        System.out.println("spring2 = " + spring2);
        System.out.println("set = " + set);
        set.remove(null);
        System.out.println("set = " + set);
        boolean react = set.remove("react");

        System.out.println("react = " + react);
        System.out.println("set = " + set);
        //요소의 갯수 확인
        int size = set.size();
        System.out.println("size = " + size);
        boolean empty = set.isEmpty();
        System.out.println("empty = " + empty);
        boolean b = !set.isEmpty();
        System.out.println("b = " + b);
//        int[] nums = {1, 2, 3, 2};
//
//        for (int n : nums) {
//            if (!set.add(n)) {
//            }
//                return n;
//        }
//        // 전체 탐색하기
//        return size;
    }
}
