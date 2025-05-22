package ch17.exercise.p08;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        Map<String, List<Member>> groupingMap = list.stream()
                .collect(Collectors.groupingBy(s -> s.getJob()));

        //for(Member member : map.get("개발자)){
        //System.out.println(member);
        //}


        System.out.println("[개발자]");
        for (Member m : list) {
            if (m.getJob().equals("개발자")) {
                String s = "이름:" + m.getName() + ", " + m.getJob();
                System.out.println(s);
            }

        }

        System.out.println();


        System.out.println("[디자이너]");
        for (Member m : list) {
            if (m.getJob().equals("디자이너")) {
                String s = "이름:" + m.getName() + ", " + m.getJob();
                System.out.println(s);
            }

        }
    }
}
