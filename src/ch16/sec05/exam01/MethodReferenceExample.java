package ch16.sec05.exam01;

import static ch16.sec05.exam01.Computer.staticMethod;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();
        //정적 메소드일경우
        //리ㅏㅁ다식
        //person.action((x,y) -> Computer.staticMethod(x,y));
        //메소드참조
        person.action(Computer::staticMethod);


        //인스턴스 메소드일 경우
        //람다식
        //person.action((x,y)->com.instanceMethod(x,y));
        //메소드참조
        Computer com = new Computer();
        person.action(com::instanceMethod);

    }
}
