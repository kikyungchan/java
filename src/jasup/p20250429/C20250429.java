package jasup.p20250429;

public class C20250429 {
    public static void main(String[] args) {
        //문제 1
        //n이 0보다 크면 양수 0이면 0 0보다 작으면 음수 출력하기
//        int n = 3;
//        if (n > 0) {
//            System.out.println("양수");
//
//        } else if (n == 0) {
//            System.out.println(0);
//        } else {
//            System.out.println("음수");
//        }

        //문제2 (반복)
        //한줄에 하나씪 출력하는 프로그램을 작성하라
//        for (int i = 1; i < 11; i++) {
//            System.out.println(i);
//        }

        //문제3 (연산자)
        //두 정수 a,b를 입력받아서
        //둘 중 큰 값을 출력하는 프로그램을 작성하라
//        int a = 5;
//        int b = 7;
//        if (a > b) {
//            System.out.println(a);
//        } else {
//            System.out.println(b);
//        }

//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i + "*" + j + "=" + (i * j)); //구구단 출력
//            }
//
//        }
//        System.out.println();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i < j && (i + 1) * (j + 1) % 3 == 0 && (i + 1) * (j + 1) % 5 == 0) {
                    System.out.println((i + 1) + "*" + (j + 1) + "=" + (i + 1) * (j + 1));
                }
            }
        }//1234123123123
    }
}
