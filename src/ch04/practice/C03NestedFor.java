package ch04.practice;

public class C03NestedFor {
    public static void main(String[] args) {
        /*
         *
         **
         ***
         ****
         *****
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
         *****
         ****
         ***
         **
         *
         */
        System.out.println("-------------------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---------------------------");
        /*
        *****
        ****#
        ***##
        **###
        *####
        #####
         */
        //1, ,0
        //2, ,1
        //3, ,2
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < (i + 1); k++) {
                System.out.print("#");
            }
            System.out.println();
        }
        // @formatter:off
        /*
         *
         **
         ***
         ****
         *****
         */
System.out.println(("----------------------"));
for(int i = 0; i < 5; i++) {
    for(int j = 0; j <(4-i) ; j++) {
        System.out.print(" ");
    }
    for(int j = 0; j <(i+1) ; j++) {
        System.out.print("*");
    }
    System.out.println();
}

        /*
         *****
          ****
           ***
            **
             *
         */
System.out.println("----------------------------");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < (5 - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        };
        /*
        0
        01
        012
        0123
        01234
         */
        System.out.println("--------------------------");
for(int i = 0; i < 5; i++) {
    for(int j = 0; j <= i; j++) {
        System.out.print(j);
    }
    System.out.println();
}

        /*
        1
        12
        123
        1234
        12345
         */
        System.out.println("--------------------------");
        for(int i = 0; i < 5 ; i++) {
            for(int j = 1; j <= (i+1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        /*
        0
        12
        345
        6789
        01234
         */
        System.out.println("-------------------");
        int num = 0;
    for(int i = 0; i < 5; i++) {
    for(int j = 0; j < (i+1); j++) {
        System.out.print(num);
        num=(num+1) % 10;
    }
    System.out.println();
}

        /*
        1
        23
        456
        7890
        12345
         */
        int s = 1;
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < (i + 1); j++, s++) {
                System.out.print(s % 10);
            }
            System.out.println();
        }
        // @formatter:on
    }
}