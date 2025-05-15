package ch12.lecture.p02system;

import java.util.Scanner;

public class App01 {
    public static void main(String[] args) {
        //System.in : 키보드
        Scanner scanner = new Scanner("hello world");
        String w1 = scanner.next();
        String w2 = scanner.next();
        System.out.println(w1);
        System.out.println(w2);

        scanner.close();

        Scanner scanner1 = new Scanner(System.in);
        String w3 = scanner.next();
        String w4 = scanner.next();
        System.out.println(w3);
        System.out.println(w4);
    }
}
