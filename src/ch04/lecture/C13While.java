package ch04.lecture;

public class C13While {
    public static void main(String[] args) {
        // 변수 scope : 선언된 중괄호 안에서만 사용가능
        boolean b = true;
        int a = 0;
        while (b) {
            a = 3;
            System.out.println(a);
            b = false;
        }
        System.out.println(a);
    }
}
