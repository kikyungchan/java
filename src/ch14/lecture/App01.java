package ch14.lecture;

public class App01 {
    public static void main(String[] args) {
        // Thread 객체를 만들어서 실행
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("내가만든 쓰래드의 실행 코드");
            }
        });
        thread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("메인 쓰레드의 시랭코드");
        }
    }
}
