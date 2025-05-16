package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class App02 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("a", "a"));
        System.out.println(Pattern.matches("a", "b"));
        //[] : 캐릭터클래스
        System.out.println(Pattern.matches("[ab]", "a"));
        System.out.println(Pattern.matches("[ab]", "b"));
        System.out.println(Pattern.matches("[ab][ab]", "ab"));
        System.out.println(Pattern.matches("[ab][ab]", "aa"));
        System.out.println(Pattern.matches("[ab][ab]", "bb"));
        System.out.println(Pattern.matches("[ab][ab]", "ba"));

        System.out.println(Pattern.matches("[a-e]", "d"));
        System.out.println(Pattern.matches("[a-e]", "a"));
        System.out.println(Pattern.matches("[a-e]", "b"));
        System.out.println(Pattern.matches("[a-z]", "A"));//알파벳 소문자 한글자
        System.out.println(Pattern.matches("[A-Z]", "O"));//알파벳 대문자 한글자
        System.out.println(Pattern.matches("[0-9]", "3"));//숫자 한글자
        System.out.println(Pattern.matches("[0-9A-Za-z]", "0"));//대소문자 숫자 한글자
        System.out.println(Pattern.matches("[가-힣]", "손"));//한글
        System.out.println(Pattern.matches("[가-힣]", "발"));
        System.out.println(Pattern.matches("[가-힣0-9a-zA-Z]", "발"));//한글숫자대소문자 한글자

    }
}
