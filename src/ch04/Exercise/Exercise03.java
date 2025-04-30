package ch04.Exercise;

public class Exercise03 {
    public static void main(String[] args) {
        int sum = 0;
        int j = 1;
        while (j < 101) {
            if (j % 3 == 0) {
                sum += j;
            }
            j++;
        }
        System.out.println("3의배수의 총 합: " + sum);
    }
}
