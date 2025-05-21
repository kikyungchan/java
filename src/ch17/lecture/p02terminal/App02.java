package ch17.lecture.p02terminal;

import java.util.List;
import java.util.Optional;

public class App02 {
    public static void main(String[] args) {
        // 최종연산의 리턴 값 중 존재하지 않을 수 있는 경우
        // Optional을 리턴
        // 옵셔널은 값이 있을수도 없을 수도 있음
        List<Integer> list = List.of(2, 4, 6, 8, 10);

        Optional<Integer> max = list.stream()
                .filter(a -> a < 5)
                .max(Integer::compareTo);
        System.out.println("max = " + max);

        Optional<Integer> max1 = list.stream()
                .filter(a -> a % 2 == 1)
                .max(Integer::compareTo);
        System.out.println("max1 = " + max1);

        //
        Optional<Integer> o1 = Optional.of(10);
        Optional<Object> o2 = Optional.empty();
        //get:값꺼내기
        Integer v1 = o1.get();
        System.out.println("v1 = " + v1);
//        Object v2 = o2.get();
//        System.out.println("v2 = " + v2);
        Integer i = o1.orElse(0);
        System.out.println("i = " + i);
        Object o = o2.orElse(0);
        System.out.println("o = " + o);

        System.out.println("o1 = " + o1.isEmpty());
        System.out.println("o2 = " + o2.isEmpty());
        System.out.println("o1.isPresent() = " + o1.isPresent());
        System.out.println("o2.isPresent() = " + o2.isPresent());
        
    }
}
