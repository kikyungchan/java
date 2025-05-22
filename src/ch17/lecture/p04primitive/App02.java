package ch17.lecture.p04primitive;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App02 {
    public static void main(String[] args) {

        //기본타입 스트림->참조타입(스트림T)
        int[] arr1 = {1, 3, 5, 7, 9};
        IntStream s1 = Arrays.stream(arr1);
        Stream<Integer> s2 = s1.boxed();
        long r1 = s2.count();
        System.out.println("r1 = " + r1);
        // 참조타입 스트림T -> 기본타입 스트림
        //맵투인트 맵투롱 맵투더블
        List<Integer> list1 = List.of(1, 3, 5, 7, 9);
        Stream<Integer> s3 = list1.stream();
        IntStream s4 = s3.mapToInt(Integer::intValue);//참조타임스트립->기본타입스트림
        long r2 = s4.count();

        System.out.println("r2 = " + r2);
    }
}
