package ch05.lecture;

public class C20250501 {
    public static void main(String[] args) {
        /*
        1
        22
        333
        4444
        55555 다음과 같은 형태로 출력해
         */
//        for (int i = 1; i < 6; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }
        /*
      1
     12
    123
   1234
  12345
         */
//        for (int i = 0; i < 5; i++) {
//            for (int j = 1; j <= (4 - i); j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= (i + 1); j++) {
//                System.out.print(j);
//            }
//
//            System.out.println();
//        }
//        int sum = 1;
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print(sum);
//                System.out.print(" ");
//                sum++;
//            }
//            System.out.println();
//        }
//        int sum = 1;
//        int j;
//        int k;
//        for (int i = 0; i < 5; i++) {
//            for (j = 0; j < 4 - i; j++) {
//                System.out.print("  ");
//            }
//            for (k = 0; k < (i + 1); k++) {
//                System.out.print(sum);
//                sum++;
//                if (k < i) {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 4 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < 2 * i + 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 4; i > 0; i--) {
//            for (int j = 0; j < 5 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < 2 * i - 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        int num = 1;
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 4 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < 2 * i + 1; j++) {
//                if (num % 2 == 1) {
//                    System.out.print(num);
//                }
//                num++;
//            }
//            System.out.println();
//        }
        int num = 1; // 홀수 출력할 변수, 각 줄마다 1부터 시작
        for (int i = 0; i < 5; i++) {

            // 공백 출력 (가운데 정렬을 위해)
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }

            // 홀수 출력
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(num);  // 홀수 출력
                num += 2; // num을 홀수만큼 증가시킴 (1, 3, 5, 7, 9, ...)
            }
            num = 1;
            System.out.println(); // 한 줄 출력 후 개행
        }
    }
}

