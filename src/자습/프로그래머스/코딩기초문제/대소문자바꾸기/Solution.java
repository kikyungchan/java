package 자습.프로그래머스.코딩기초문제.대소문자바꾸기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);

            } else {
                result += Character.toLowerCase(c);
            }
        }
    }
}

