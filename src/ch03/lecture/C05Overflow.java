package ch03.lecture;

public class C05Overflow {
    public static void main(String[] args) {
        int a = 1_000_000_000;
        System.out.println("a = " + a);
        a = a * 2;
        System.out.println("a = " + a);
        a = a * 2;
        System.out.println("a = " + a);

        long b = 1_000_000_000;
        System.out.println("b = " + b);
        b = b * 2;
        System.out.println("b = " + b);
        b = b * 2;
        System.out.println("b = " + b);
    }
}
