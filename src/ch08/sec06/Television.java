package ch08.sec06;


public class Television implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV킬게");
    }

    @Override
    public void turnOff() {
        System.out.println("TV끌게");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > ch08.sec04.RemoteControl.MAX_VOLUME) {
            this.volume = ch08.sec04.RemoteControl.MAX_VOLUME;
        } else if (volume < ch08.sec04.RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("this.volume = " + this.volume);

    }
}

