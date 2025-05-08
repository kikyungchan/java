package ch06.sec08.exam04;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator my = new Calculator();
        double result1 = my.areaRectangle(10);

        double result2 = my.areaRectangle(10, 20);
        System.out.println("정사각형의 넓이 = " + result1);
        System.out.println("직사각형2의 넓이 = " + result2);
    }
}
