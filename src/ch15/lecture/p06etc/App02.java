package ch15.lecture.p06etc;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App02 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new TreeSet<>();

        //Set 중복요소가 없다

        //HashSet : 순서 보장 X이다
        //TreeSet:  순서 보장 O이다(내추럴오더링,컴페어레이터)

        set1.add("java");
        set1.add("spring");
        set1.add("css");
        set1.add("html");
        set1.add("sql");

        set2.add("java");
        set2.add("spring");
        set2.add("css");
        set2.add("html");
        set2.add("sql");

        System.out.println(set1);
        System.out.println(set2);

    }
}
