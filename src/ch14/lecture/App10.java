package ch14.lecture;

import java.util.concurrent.atomic.AtomicInteger;

public class App10 {
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

class Box10 {
    private AtomicInteger value;
    private Object lock = new Object();

    public Box10(

    ) {
        value = new AtomicInteger(0);
    }

    public int getValue() {
        return value.intValue();
    }

    //싱크로나이즈블럭
    //모니터 락 을 획득한 스레드만 실행 가능
    //이때는 디스
    public void increase() {

        value.incrementAndGet();


    }
}
