package ch02.lecture;

public class C13Scope {
    public static void main(String[] args) {
        //변수는 선언된 코드 블럭 안에서만 사용 가능

        int a = 3;

        System.out.println("a = " + a);

        if (true) {
            int b = 5;
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
        System.out.println("a = " + a);
//        System.out.println(b); 변수는 코드블럭내에서만 유효
        if (true) {
            int b = 7;
//            int a = 9; 같은 코드블럭내에 같은이름의 변수 선언 불가
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(i);

        }
//        System.out.println("i = " + i); 코드블럭내에서만
        int i = 0;
        for (; i < 1; i++) {

        }

    }

}
