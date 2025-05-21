package ch17.sec01.exam01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("김동현");
        names.add("정찬성");
        names.add("최두호");

        Stream<String> stream = names.stream();
        stream.forEach(name -> System.out.println(name));
//        names.stream().forEach(System.out::println);
//        Stream<String> stream = names.stream();
//        System.out.println(stream.toArray());
    }
}
