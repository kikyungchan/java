package 자습.p20250523;


public class HelloThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from thread");
        }
    }

    public static void main(String[] args) {
        HelloThread t = new HelloThread();
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from main");
        }
    }
}

