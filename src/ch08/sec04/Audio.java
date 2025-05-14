package ch08.sec04;

public class Audio implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("오디오킬게");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오끌게");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("this.volume = " + this.volume);

    }
}
