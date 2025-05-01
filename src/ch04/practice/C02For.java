package ch04.practice;

public class C02For {
    public static void main(String[] args) {
        /*
        0
        1
        2
        3
        4
         */
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("------------------");

        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }
        System.out.println("--------------------------");
//        0 2 4 8 6

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("--------------------------");
        // 2 4 6 8 10
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("--------------------------");
        // 4 3 2 1 0
        for (int i = 4; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("--------------------------");
        // 5 4 3 2 1
        for (int i = 5; i > 0; i--) {
            System.out.println(i);

        }
        System.out.println("--------------------------");
        // * * * * *
        for (int i = 0; i < 6; i++) {
            System.out.print("*");
        }



        /*
         *****
         *****
         *****
         *****
         *****
         */
        System.out.println();

        for (int i = 1; i < 6; i++) {
            System.out.println("*");
            System.out.println("**");
            System.out.println("***");
            System.out.println("****");
            System.out.println("*****");

        }
    }
}
