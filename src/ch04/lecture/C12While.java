package ch04.lecture;

public class C12While {
    public static void main(String[] args) {
        //while
        // ()조건이 true면 코드블럭 실행하고
        //  다시 조건확인을 반복

        System.out.println("code1");
        int i = 0;
        while (i < 5) {
            System.out.println("code2");
            System.out.println("code3");

            i++;
        }
        System.out.println("code4");
        System.out.println("code5");
    }
}
