package jasup.p20250514.App01;

public class AnonymousExample {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("AnonymousExample.run");
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
