package ch16.lecture.p01lambda;

public class App03 {
    public static void main(String[] args) {
        MyInterface03 a = () -> {
            System.out.println("code1");
            System.out.println("code2");
        };
        MyInterface03 b = () -> {
            System.out.println("code1");
            System.out.println("code2");
        };
        b.method();

        MyInterface03 c = () -> System.out.println("code99");
    }

}

@FunctionalInterface
interface MyInterface03 {
    void method();


}
