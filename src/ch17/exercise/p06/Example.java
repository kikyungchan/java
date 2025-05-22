package ch17.exercise.p06;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = List.of(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("감자바", 26)
        );

        //고전 for문
//        double sum = 0;
//        for (Member member : list) {
//            sum += member.getAge();
//        }
//        double avg = sum / list.size();
//        System.out.println("avg = " + avg);

        //참조타입 stream
//        Integer sum2 = list.stream()
//                .map(Member::getAge)
//                .reduce(0, Integer::sum);
//        Double avg2 = sum2.doubleValue() / list.size();
//        System.out.println("avg2 = " + avg2);

        //기본타입 stream
        double avg = list.stream()

                .mapToInt(Member::getAge)
                .average()
                .orElse(0);

        System.out.println("avg = " + avg);


    }
}
