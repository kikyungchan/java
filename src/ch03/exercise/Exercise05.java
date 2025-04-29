package ch03.exercise;

public class Exercise05 {
    public static void main(String[] args) {
        int lengthTop = 5; // 윗변의 길이
        int lengthBottom = 10; // 아랫변의 길이
        int height = 7; //높이

        // (위+아래)*높/2
//        double area = (lengthTop + lengthBottom) * height / 2; //52.0
        double area = (lengthTop + lengthBottom) * height * 1.0 / 2; // 52.5
//        double area = (double) (lengthTop + lengthBottom) * height / 2; //52.5
//        double area = (double) ((lengthTop + lengthBottom) * height / 2); // 52.0

        System.out.println("area = " + area);
    }
}
