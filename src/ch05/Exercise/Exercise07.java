package ch05.Exercise;

public class Exercise07 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};
        // 배열의 첫번쨰 값을 기준으로 새로운 변수 선언.
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            //배열의 값을 순환하면서 배열의 첫번쨰 값이랑 비교해서
            //첫번째 값보다 순환한 값이 크면 큰값으로 리턴;
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
