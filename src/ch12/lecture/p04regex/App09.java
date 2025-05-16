package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class App09 {
    public static void main(String[] args) {
        // | : or

        System.out.println(Pattern.matches("(ab|12)", "ab"));//true
        System.out.println(Pattern.matches("(ab|12)", "12"));//true
        System.out.println(Pattern.matches("(ab|12)+", "12ab12ab12ab12ab12abab1212abababab12121212"));//true
    }
}
