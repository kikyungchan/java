package ch16.lecture.p01lambda;

public class App02 {
    public static void main(String[] args) {
        //lambda:츄상메소드 하나인 인터패이스 의 익명 클래스 객채
        //람ㅂ다는 추상메소드 하나일떄만 사용가능!!
        //추상매소드 하나인 인터페이스 펑셔널인터패이스
        MyInterface02 a = () -> {
            System.out.println("App02.method1");
        };
    }
}

//@FunctionalInterface: 이 인터패이스가 펑셔널인터패이스인지 확인
// (즉 추상매소드가 하나인지) 검사하는 매쏘드
@FunctionalInterface
interface MyInterface02 {
    void method1();
}
