package ch05.lecture;

import java.util.Arrays;

public class C20New {
    public static void main(String[] args) {
        //new : 새 객체(instance)가 만들어진 공간을 마련하고 참조값을 결과로 둠
        int[] a;
        a = new int[]{3, 4}; // 참조값
        int[] c;
        c = a; // 참조값 복사
        System.out.println(Arrays.toString(a));

        int b;
        b = 3;
        int d;
        d = b;
        System.out.println(b == d); // true 기본(타입)값 비교
        System.out.println(a == c); // true 참조(타입)값 비교
    }
}
