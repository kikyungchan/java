package ch04.lecture;

public class C05Random {
    public static void main(String[] args) {
        //Math.random() :  0.0보다크거나같고 1보다 작은값 (1은안됌)
        // double 값 리턴
        double a = Math.random();

        // 0.0 <= a < 1.0
        System.out.println("a = " + a);
        //예제 ) 주사위 1,2,3,4,5,6 중의 임의의 한개의 값
        //0.0 <= a * 6 < 6.0
        a = a * 6;
        System.out.println("a = " + a);

        int b = (int) a;

        b = b + 1;
        System.out.println("b = " + b);

        //한줄에 작성
        int c = ((int) (Math.random() * 6)) + 1;
        System.out.println("c = " + c);

        //책 119쪽
        int score = ((int) (Math.random() * 20)) + 81;


    }
}
