package 자습.p20250521;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class App01 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("김동현");
        names.add("정찬성");
        names.add("최두호");

        names.stream().forEach(System.out::println);
        Stream<String> stream = names.stream();

        System.out.println();

        List<Integer> num = List.of(1, 2, 3, 4, 5, 6);

        num.stream()
                .filter(a -> a % 2 == 0)
                .forEach(System.out::println);
        System.out.println();


        List<String> words = List.of("java", "stream", "practice");
        words.stream()
                .map(String::
                        toUpperCase)
                .forEach(System.out::println);
        System.out.println();
        System.out.println();
        List<String> senteces = List.of(
                "I love Java",
                "Streams are powerful",
                "java is fun",
                "Functional programming");

        senteces.stream()
                .filter(s -> s.toUpperCase().contains("JAVA"))
                .forEach(System.out::println);

        List<Integer> nums = List.of(10, 20, 30, 40);

        nums.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(System.out::println);

        System.out.println();
        System.out.println();

        //학생 점수 처리
//        List<Integer> scores = List.of(90, 60, 45, 80, 70, 30, 85);
//
//        scores.stream()
//                //50점 이상인 학생들만
//                .filter(a -> a > 50)
//                //최고점과 최저점을 구해서
//                .sorted((a, b) -> (b - a))
//                .limit(2)
//                //기본타입으로
//                .mapToInt(n -> n)
//                //평균을 구해서
//                .average()
        //학생이 없을경우엔 메세지출력
//                .orElse("학생이 없습니다");

        List<String> fruits = List.of(
                "apple",
                "banana",
                "kiwi",
                "orange",
                "grape");
        fruits.stream()
                .filter(a -> a.length() >= 5)
                .map(String::toUpperCase)
                .sorted((a, b) -> a.length() - b.length())
                .limit(3)
                .forEach(System.out::println);
        System.out.println();
        System.out.println();
        List<String> items = Arrays.asList(
                "apple", "banana",
                "Apple", "grape",
                "banana", "Mango",
                "peach", "melon");
        items.stream()

                .filter(a -> a.matches("[a-z]+"))
                .distinct()
                .sorted((a, b) -> b.compareTo(a))
                .skip(items.size() - 5)
                .forEach(System.out::println);


    }
}
