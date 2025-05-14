package ch08.sec07;

public interface Service {
    default void defaultMethod1() {
        System.out.println("디폴트메소드1 종속코드");
        defaultCommon();
    }

    default void defaultMethod2() {
        System.out.println("디폴트메소드2 종속코드");
        defaultCommon();
    }

    private void defaultCommon() {
        System.out.println("디폴트메소드 중복코드A");
        System.out.println("디폴트메소드 중복코드B");
    }

    static void staticMethod1() {
        System.out.println("스태틱메소드1 종속코드");
        staticCommon();
    }

    static void staticMethod2() {
        System.out.println("스태틱메소드2 종속코드");
        staticCommon();
    }

    private static void staticCommon() {
        System.out.println("스태틱메소드 중복 코드C");
        System.out.println("스태틱메소드 중복 코드D");
    }
}
