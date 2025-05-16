package ch12.exercise.p17;

import java.util.regex.Pattern;

public class PatternMatcherExample {
    public static void main(String[] args) {
        String id = "5Angel1004";
        String Exp = "[a-zA-z][a-zA-z0-9]{7,11}";

        boolean isMatch = Pattern.matches(Exp, id);
        if (isMatch) {
            System.out.println("아이디로 사용할 수 있습니다");
        } else {
            System.out.println("아이디로 사용할 수 없습니다");
        }
    }
}
