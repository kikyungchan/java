package ch04.lecture;

public class C14DoWhile {
    public static void main(String[] args) {
        //while : ()조건 혹인 후 중괄호 실행 하고 다시 조건확인하고 중괄호 실행 반복

        // do while : 중괄호 실행 후 조건확인 - 트루면 실행///// 순서가 다름
        System.out.println("code 1");
        boolean a = true;
        do {
            System.out.println("code 2");
            System.out.println("code 3");
        } while (a);
        System.out.println("code 4");
        System.out.println("code 5");
    }
}
