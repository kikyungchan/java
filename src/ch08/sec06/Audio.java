package ch08.sec06;

public class Audio implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("오디오 킬게");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오 끌게");
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

    private int memoriVolume;

    @Override
    public void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음처리할게");
            //추상메소드호출하면서 상수 필드 사용
            setVolume(MIN_VOLUME);

        } else {
            System.out.println("무음해제할게");
        }
    }
}

