package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class App08 {
    public static void main(String[] args) {
        // () : 그룹

        System.out.println(Pattern.matches("(\\d{3} )+", "342 "));//true
        System.out.println(Pattern.matches("(\\d{3} )+", "342 987 "));//true
        System.out.println(Pattern.matches("(\\d{3} )+", "342 987 011"));//true

    }
}
