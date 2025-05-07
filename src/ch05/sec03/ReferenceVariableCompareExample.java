package ch05.sec03;

public class ReferenceVariableCompareExample {
    public static void main(String[] args) {
        int[] arr1;//배열선언
        int[] arr2;
        int[] arr3;

        arr1 = new int[]{1, 2, 3};//참조값
        arr2 = new int[]{1, 2, 3};//참조값
        arr3 = arr2;//참조값 복사

        System.out.println(arr1 == arr2); // 폴스
        System.out.println(arr2 == arr3); // 트루
    }
}
