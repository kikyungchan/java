package ch08.exercise.p05;

public class TV implements Remocon {
    public static void main(String[] args) {
        Remocon r = new TV();
        r.powerOn();
    }

    @Override
    public void powerOn() {
        System.out.println("TV 킬게");
    }
}
