package ch04.lecture;

public class C19For {
    public static void main(String[] args) {
        // 2x1
        // 2x2
        // 2x3
        // ...
        // 2x9

        // 3x1
        // ..
        // 3x9

        // ..

        // 9x9

        for (int i = 2; i < 10; i++) {
            System.out.println(i + "단##############################");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
        }
    }
}
