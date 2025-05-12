package ch07.sec07.exam01;

class A {

}

class B extends A {

}

class C extends A {
}

class D extends B {
}

class E extends C {
}


public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;
        B b1 = d;
        C c1 = e;
        System.out.println(a1 == b);
        System.out.println(a2 == c);
        System.out.println(a3 == d);
        System.out.println(a4 == e);
        System.out.println(b1 == d);
        System.out.println(c1 == e
        );
        //B b3 = e
        //C c2 =

    }
}
