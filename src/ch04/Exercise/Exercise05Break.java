package ch04.Exercise;

public class Exercise05Break {
    public static void main(String[] args) {

        System.out.println();
        boolean gotcha = false;
        for (int x = 1; x < 11; x++) {
            for (int y = 1; y < 11; y++) {
                if ((4 * x) + (5 * y) == 60) {
                    System.out.println("(" + x + "," + y + ")");
                    gotcha = true;

                }
            }
            if (gotcha) {
                break;
            }

        }
    }
}
