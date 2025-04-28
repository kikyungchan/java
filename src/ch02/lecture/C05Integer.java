package ch02.lecture;

public class C05Integer {
    public static void main(String[] args) {
        // 정수형
        //byte(1byte, 8bits)
        //0000 0000 ~ 1111 1111
        //맨 앞자리가 0이면 양수
        //앞자리가 1이면 음수

        byte a; // a는 바이트 타입
        a = 127; //최대값
        System.out.println("a=" + a);
        a = -128;//최소값
        System.out.println("a=" + a);

        //short(2bytes, 16bits)
        short b; // b는 숏타입
        b = 32767; // 최대값
        System.out.println("b=" + b);
        b = -32768; // 최소값
        System.out.println("b=" + b);

        //int(4bytes, 32bits)
        int c; // c는 인트타입
        c = 2147483647;//최대값
        System.out.println("c=" + c);
        c = -2147483648;//최소값
        System.out.println("c=" + c);

        //long(8bytes, 64bits)
        long d; // d는 롱타입
        d = 9223372036854775807L;
        System.out.println("d=" + d);
        d = -9223372036854775808L;
        System.out.println("d=" + d);

        // java 코드에서 정수 literal는 int로 해석
        // long type literal 은 L(l)붙여야 함
    }
}
