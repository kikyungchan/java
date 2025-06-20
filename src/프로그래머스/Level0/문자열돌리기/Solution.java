package 프로그래머스.Level0.문자열돌리기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            System.out.println(c);
            System.out.println();
        }
    }
}
