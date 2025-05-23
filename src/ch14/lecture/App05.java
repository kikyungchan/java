package ch14.lecture;

public class App05 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println("runnale  ㅐ객체' ");
            }
        });
        Thread myThread = new MyThread5();
        myThread.start();

        thread.start();


    }

    static class MyThread5 extends Thread {
        //run메소드 재자ㅓㅇㅇ의 해야함
        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                System.out.println("[[Thread 상속해서 만든 코드]]");
            }
            super.run();
        }
    }
}


