package ch06.lecture.p11etc;

public class C02Singleton {
    public static void main(String[] args) {
        // singleton : 프로그램을 작성하는 패턴 중 하나
        // 특정 타입(클래스)의 객체가 프로그램 내에
        // 하나가 되도록 보장하는 코드 패턴

        MyClass01 a = new MyClass01();
        MyClass01 b = new MyClass01(); // 두개니까 싱글톤이 아니ㅈㄶ아

//        MyClass02 c = new MyClass02();
//        MyClass02 c = new MyClass02();


        MyClass02 e = MyClass02.getInstance();
        MyClass02 f = MyClass02.getInstance();


        System.out.println(e == f); // 둘이 다른객체다


    }
}

class MyClass02 {
    private MyClass02() {

    }


    private static MyClass02 object;

    public static MyClass02 getInstance() {
        if (object == null) {
            MyClass02 o = new MyClass02();
            object = o;
        }
        return new MyClass02();
    }
}

class MyClass01 {

}
