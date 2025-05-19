package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class App01 {
    public static void main(String[] args) {
        // Collection : 객체를 저장한 객체(의 타입)
        // Collection Framework: 객체를 저장한 객체의 타입(클래스.인터페이스)
        // 와 관련된 메소드의 모음

        // List, Set, Map, Stack, Queue
        // List: 저장된 요소의 순서가 있음
        // Set: 중복된 요소를 저장하지 않음
        // Map: 키(Key)를 값(value)에 매핑함
        // Stack : 마지막에 들어간 객체가 먼저 출력 됨( LIFO)
        // Queue : 먼저 들어간 객체가 먼저 출력됨( FIFO)

        // List
        List<String> list = new ArrayList<>();

        // 요소(엘레멘트) 추가
        //add
        System.out.println(list);
        list.add("java");
        System.out.println(list);
        list.add("sptring");
        System.out.println(list);
        list.add("react");
        System.out.println(list);
        list.add("java");
        System.out.println(list);

        //특정 위치에 넣기
        list.add(1, "sql");
        System.out.println(list);

        //특정 위치의 요소 교채
        list.set(2, "vue");
        System.out.println(list);

        // 몇 개의 요소가 있는지 확인
        int size = list.size();
        System.out.println("size = " + size);

        //특정 요소가 있는 지 확인
        boolean spring = list.contains("spring");
        System.out.println("spring = " + spring);
        boolean vue = list.contains("vue");
        System.out.println("vue = " + vue);

        //특정 위치의 요소 얻기
        String string = list.get(0);
        System.out.println("string = " + string);
        String string1 = list.get(3);
        System.out.println("string1 = " + string1);
        String last = list.getLast();
        System.out.println("last = " + last);
        String string2 = list.get(list.size() - 1);
        System.out.println("string2 = " + string2);

        //특정 요소 지우기
        list.remove("vue");
        System.out.println(list);
        list.remove("java");
        System.out.println(list);

        //특정 위치의 요소 지우기
        list.remove(0);
        System.out.println(list);
    }
}
