package ch04.lecture;

public class C16For {
    public static void main(String[] args) {
        //for문 종료 이후에도 사용하고 싶을 때
        int i;
        for (i = 0; i < 3; i++) {
            System.out.println(i);
        }

        System.out.println(i);
    }
}
