package ch14.exercise.p02;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread = new MovieThread();
        thread.start();

        Thread thread2 = new Thread(new MusicRunnable());
        thread2.start();

    }
}
