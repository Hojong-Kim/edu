package ch07;

public interface RemoteControl {
    public static final int MAX_VOLUME = 10;    // public static final이 자동으로 붙는다.
    int MIN_VOLUME = 0;

    public abstract void turnOn();
    public void turnOff();
    abstract void volumeUp();
    void volumeDown();      // void 좌측에 있는 것들은 생략 가능.
}
