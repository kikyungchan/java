package ch17.sec12.exam01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동", "남", 92));
        totalList.add(new Student("김수영", "여", 87));
        totalList.add(new Student("감자바", "남", 92));
        totalList.add(new Student("오해영", "여", 95));


        //남학생만 묶어 List생성
//        List<Student> maleList = totalList.stream()
//                .filter(s->s.getSex().equals("남"))
//                .collect(Collectors.toList())

        //고전적 for문(남학생들만)
//        List<Student> malelist = new ArrayList<>();
//        for (Student student : totalList) {
//            if (student.getSex().equals("남")) {
//                malelist.add(student);
//            }
//        }


        List<Student> maleList =
                totalList.stream()
                        .filter(s -> s.getSex().equals("남"))
                        .toList();

        maleList.stream()
                .forEach((s -> System.out.println(s.getName())));


        System.out.println();
//고전적 for 문 (Map 학생 이름=키,학생 점수=값)
//        Map<String, Integer> map1 = new HashMap<>();
//        for (Student s : totalList) {
//            map1.put(s.getName(), s.getScore());
//        }
//        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }


        //학생 이름을 키, 학생의 점수를 값으로 갖는 Map
        Map<String, Integer> map = totalList.stream()
                .collect(
                        Collectors.toMap(
                                //student 객체에서 키가 될 부분(이름)
                                s -> s.getName(),
                                //student 객체에서 값이 될 부분(점수)
                                s -> s.getScore()
                        )
                );
        System.out.println(map);

    }
}
