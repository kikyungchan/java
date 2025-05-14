package ch08.sec06;

public interface RemoteControl {
    //상수필드
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    //추상 메소드
    void turnOn();

    void turnOff();

    void setVolume(int volume);

    //디폴드 메소드
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음처리할게");
            //추상메소드호출하면서 상수 필드 사용
            setVolume(MIN_VOLUME);

        } else {
            System.out.println("무음해제할게");
        }
    }

    //정적 메소드
    static void changeBattery() {
        System.out.println("건전지 교환할게");
    }
}
