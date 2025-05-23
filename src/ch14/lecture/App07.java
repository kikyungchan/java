package ch14.lecture;

public class App07 {
    public static void main(String[] args) throws InterruptedException {
        Box10 box = new Box10();
        Thread h1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                box.increase();
            }
        });
        h1.start();
        Thread h2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                box.increase();
            }
        });
        h2.start();

        h1.join();
        h2.join();

        int value = box.getValue();
        System.out.println("value = " + value);

    }
}

class Box07 {
    private int value;
    private Object lock = new Object();

    public int getValue() {
        return value;
    }

    public void increase() {
        //싱크로나이즈블럭
        //모니터 락 을 획득한 스레드만 실행 가능
        synchronized (lock) {
            value++;
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
        }
    }
}