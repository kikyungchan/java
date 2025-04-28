package ch02.sec03;

public class CharExample {
    public static void main(String[] args) {
        char c1 = 'A'; //문자저장
        char c2 = '\u2661'; //유니코드 직접 저장
        char c3 = '가'; //문자 저장
        char c4 = '\u266C'; //유니코드 직접 저장
        char c5 = '\u3041'; //유니코드 직접 저장
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);
        System.out.println("c5 = " + c5);
    }
}
