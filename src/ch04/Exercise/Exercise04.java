package ch04.Exercise;

public class Exercise04 {
    public static void main(String[] args) {


//        while (true) {
//            int a = ((int) (Math.random() * 6) + 1);
//            int b = ((int) (Math.random() * 6) + 1);
//            System.out.println("(" + a + "," + b + ")");
//            if ((a + b) == 5) {
//                System.out.println("실행을 멈춥니다.");
//                break;
//            }
//        }
        do {
            int a = ((int) (Math.random() * 6) + 1);
            int b = ((int) (Math.random() * 6) + 1);
            System.out.println("(" + a + "," + b + ")");
            if ((a + b) == 5) {
                System.out.println("실행을 멈춥니다.");
                break;
            }
        } while (true);
    }
}
