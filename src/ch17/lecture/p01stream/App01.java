package ch17.lecture.p01stream;

import java.util.List;

public class App01 {
    public static void main(String[] args) {
        // Stream API : collection (또는 배열)의 요소들을
        // 조작하는 유용한 메소드들의 모음

        List<String> list1 = List.of("banana", "melon", "mango", "lemon", "cherry");
        //과일 이름에 m이 포함된 과일들의 갯수를 구하세요
        //고전적인 방법(명령형 프로그래밍) 임퍼레ㅇㅣ티브 프로그래밍
        int count = 0;
        for (String item : list1) {
            if (item.contains("m")) {
                count++;
            }
        }
        System.out.println("count = " + count);

        // Stream 사용(선언형 프로그래밍) 디클레이티브 프로그래밍
        long m = list1.stream()
                .filter(i -> i.contains("m"))
                .count();
        System.out.println("m = " + m);
    }
}
