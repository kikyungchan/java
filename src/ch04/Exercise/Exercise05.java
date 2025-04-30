package ch04.Exercise;

public class Exercise05 {
    public static void main(String[] args) {


        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if ((i * 4) + (j * 5) == 60) {
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }
    }
}
