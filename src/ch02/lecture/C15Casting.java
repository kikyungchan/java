package ch02.lecture;

public class C15Casting {
    public static void main(String[] args) {
        //작은타입 -> 큰타입 ( 문제없음)

        //큰타입 -> 작은타입 (문제가 있을 수 있음, 매우 조심해야함)

        byte a;
        short b;
        b = 100;
        System.out.println("b = " + b);//100

        //기본적으론안됌, 강제로 해야함(type casting)
        a = (byte) b;
        System.out.println("a = " + a);

        b = 128;
        a = (byte) b;
        System.out.println("b = " + b);
        System.out.println("a = " + a);//128?

        b = 987;
        a = (byte) b;
        System.out.println("b = " + b);
        System.out.println("a = " + a);

        //실수형 ->정수형(강제로)
        //소수점 이하 버릴 때 유용함
        double c = 123.456;
        int d = (int) c; // type casting

        System.out.println("c = " + c);
        System.out.println("d = " + d);

    }
}
