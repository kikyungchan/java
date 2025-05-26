package 자습.p20250523;

public class MultiThreadExample {
    public static void main(String[] args) throws InterruptedException {
        // 첫 번째 스레드
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("🟦 Thread 1: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // 두 번째 스레드
        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("🟥 Thread 2: " + i);
                try {
                    Thread.sleep(500); // 0.5초 쉬기
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // 스레드 시작
        thread1.start();
        thread2.start();
        //스레드 기다려
        thread1.join();
        thread2.join();
    }
}
