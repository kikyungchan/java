package ch12.lecture.p02system;

public class App03 {
    public static void main(String[] args) {

        //nanotime():프ㅜ로그램실행시간측정을위한메ㅅㅗ드
        long start = System.nanoTime();

        long end = System.nanoTime();

        System.out.println("프로그램 시래");

        long result = end - start;
    }
}
