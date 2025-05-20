package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App02 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("spring");
        set.add("react");
        set.add("mysql");
        set.add("html");
        //전체 탐색

        //향상 포문
        System.out.println("향상포문------------");
        for (String item : set) {
            System.out.println("item = " + item);
        }
        //포이치
        System.out.println("포이치---------");
        set.forEach(e -> System.out.println(e));
//        set.forEach(System.out::println);
        //스트림
        System.out.println("스트림----------");
        set.stream()
                .forEach(System.out::println);

        //이터레이터
        System.out.println("이터레이터-----------");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println("item = " + item);
        }

    }
}
