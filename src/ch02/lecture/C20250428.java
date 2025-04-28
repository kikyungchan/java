package ch02.lecture;

public class C20250428 {
    public static void main(String[] args) {
//        int a;
//        a = 7;
//        int b;
//        b = 3;
//        System.out.println(a + b);


//        int x = 10;
//        int y = 4;
//        System.out.println(x / y);
//        System.out.println(x % y);


//        int num = 3;
//        if (num % 2 == 0) {
//            System.out.println("짝수입니다");
//        } else {
//            System.out.println("홀수입니다");
//        }


//        int a = 1;
//        for (int i = 1; i < 6; i++) {
//            System.out.println(i);
//        }


//        int[] arr = {1, 2, 3, 4, 5};
//        for (int i = 1; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }


//        int[] arr = {1, 2, 3, 4, 5};
//        int sum = 0; // 합을 저장할 변수
//
//        //배열을 순회하면서 합을 구하기
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//
//        }
//        System.out.println("배열의 합:" + sum);


//        int[] arr = {1, -2, 3, -4, 5, -6, 7, -8, 9, 10};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) {
//                sum++;
//            }
//
//        }
//        System.out.println("양수의 개수:" + sum);


//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }


//        int[] arr = {1, 2, 3, 4, 5};
//        int Average = 0;
//        for (int i = 0; i < arr.length; i++) {
//            Average += arr[i];
//        }
//        double sum = (double) Average / arr.length;
//        System.out.println("평균값: " + sum);


//        int num1 = 10;
//        int num2 = 20;
//
//        //max 함수 호출하여 큰 값 구하기
//        int result = max(num1, num2);
//
//        //결과 출력
//        System.out.println("큰 값은: " + result);
//
//    }
//        public static int max ( int a, int b){
//            if (a > b) {
//                return a;
//            } else {
//                return b;
//            }


//        int[] arr = {10, 20, 30, 40, 50};
//        int SumArray = 0;
//        for (int i = 0; i < arr.length; i++) {
//            SumArray += arr[i];
//        }
//        System.out.println("배열의 합은 :" + SumArray);


//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                System.out.println(arr[i]);
//            }
//        }


//        for (int i = 1; i < 101; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println(i);
//            }
//        }


//        int sum = 0;
//        for (int i = 1; i < 101; i++) {
//            if (i % 3 == 0 || i % 5 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println("3의배수이거나 5의 배수인 숫자의 합은 " + sum);


//        for (int i = 1; i < 101; i++) {
//
//            if (i * 2 > 50) {
//                System.out.println(i * 2);
//            }
//
//
//        }

        int sum = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
                if (sum < 2000) {
                    System.out.println(sum);
                } else {
                    System.out.println("합이 2000을 넘었습니다");
                }
            }
        }
    }
}
