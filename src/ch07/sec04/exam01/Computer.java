package ch07.sec04.exam01;

public class Computer extends Calculator {
    //메소드 오버라이딩

    @Override
    public double areaCircle(double r) {
        System.out.println("Computer객체의 아리아써클 실행");
        return Math.PI * r * r;
    }
}
