package ch05.lecture;

public class C06Length {
    public static void main(String[] args) {
        int[] a = {99, 11, 88, 22, 33};

        for (int i = 0; i < 4; i++) {
            System.out.println("a[" + i + "] = " + a[i]);

        }

        //length : 배열의 길이
        System.out.println("a.length = " + a.length);

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

        //첫번째 인덱스는 0
        //마지막 인덱스는 길이-1 length-1
        System.out.println("마지막 값: " + a[a.length - 1]);
    }
}
