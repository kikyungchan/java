package ch07.lecture.p04cast;

import ch07.sec07.exam03.Parent;

public class App05 {
    public static void main(String[] args) {
        //확인 하고 강제형변환(type casting)

        //instanceof 연산자 : 형변환 가능한 타입인지 확인
        //왼쪽(참조변수), 오른쪽(타입)
        //결과 boolean
        Parent05 a = new Child051();
        System.out.println((a instanceof Child051));
        System.out.println(a instanceof Parent05);
        System.out.println(a instanceof Child052);

        //형변환 가능한지 확인하고 강제 형변환 해야함
        if (a instanceof Child051) {
            System.out.println("형변환 가능1");
            Child051 b = (Child051) a;
        }

        //형변환 가능한지 확인하고 강제 형변환 해야함
        if (a instanceof Child052) {
            System.out.println("형변환 가능2");
            Child052 c = (Child052) a;
        }

        //형변환 가능한 지 확인하고 강제형변환 코드
        if (a instanceof Child051 d) {
            System.out.println("확인하고 형변환 됨3");
            System.out.println(d);

        }

        if (a instanceof Child052) {
            System.out.println("확인하고 형변환 됨4");
            Child052 e = (Child052) a;
            System.out.println(e);
        }

        System.out.println("프로그램 종료");
    }
}

// @formatter:off
class Parent05{}
class Child051 extends Parent05 {}
class Child052 extends Parent05 {}
