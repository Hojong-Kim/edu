package ch07;

public class TelevisionTest {
    public static void main(String[] args) {

        Television tv = new Television();
        RemoteControl rc = tv;
        Television tv2 = (Television) rc;
        //rc.volumeState();    호출할 수 없다.

        tv.volumeState();
        for (int i = 0; i < 100; i++) {
            tv.volumeUp();
        }

        tv.volumeState();
        for (int i = 0; i < 200; i++) {
            tv.volumeDown();
        }

        tv.volumeState();
    }
}
