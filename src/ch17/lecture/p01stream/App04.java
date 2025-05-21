package ch17.lecture.p01stream;

import java.util.List;
import java.util.stream.Stream;

public class App04 {
    public static void main(String[] args) {
        //collection 또는 배열 에서 stream 을
        // 만들고 연산 (메소드) 실행
        List<Integer> list = List.of(5, 6, 7, 8, 9, 10, 11);

        //1.중간연산(인터미디에이트 오퍼레이션)
        // 리턴타입:Stream(... Stream)
        // 최종연산이 없으면 실해되지 않음
        Stream<Integer> s1 = list.stream();
        Stream<Integer> s2 = s1.filter(i -> i % 2 == 0);
        Stream<Integer> s3 = s2.map(i -> i * i);
        //2.최종연산(터미널 오퍼레이션)
        // 리턴타입:Stream이 아님
        s3.forEach(System.out::println);//최종연산

        //메소드 체이닝
        list.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * i)
                .forEach(System.out::println);

    }
}
