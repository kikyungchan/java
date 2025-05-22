package ch17.exercise.p07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = List.of(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );


//        for문으로
        List<Member> developers = new ArrayList<>();
        for (Member m : list) {
            if (m.getJob().equals("개발자")) {
                developers.add(m);
            }
        }

        System.out.println(developers);


//        //스트림으로
//        developers = list.stream()
//                .filter(s -> s.getJob().equals("개발자"))
//                .toList();
//
//        developers.stream()
//                .forEach(m -> System.out.println(m.getName()));
    }
}