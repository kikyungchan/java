package ch17.lecture.p04primitive;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class App03 {
    public static void main(String[] args) {

        int sum = IntStream.range(0, 10)  // 0부터 9까지의 숫자를 포함한 스트림 생성
                .sum();        // 그 숫자들의 합을 계산
        System.out.println("sum = " + sum);

        int sum1 = IntStream.range(1, 101)
                .sum();
        System.out.println("sum1 = " + sum1);

        int sum2 = IntStream.range(1, 101)
                .filter(s -> s % 2 == 0)
                .sum();

        int sum3 = IntStream.rangeClosed(1, 10)
                .sum();
        System.out.println("sum3 = " + sum3);

        long sum4 = LongStream.range(1, 10)
                .sum();
        System.out.println("sum4 = " + sum4);

        long sum5 = LongStream.rangeClosed(1, 10)
                .sum();
        System.out.println("sum5 = " + sum5);

        //random
        Random random = new Random();
        random.ints()
                .limit(5)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        random.ints(0, 10)
                .limit(3)
                .sorted()
                .distinct()
                .forEach(System.out::println);
        System.out.println("lotto");
        random.ints(0, 45)
                .map(e -> e + 1)
                .distinct()
                .limit(6)

                .forEach(System.out::println);

    }
}
