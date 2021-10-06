package ch07;

public class DmbCellPhone extends CellPhone {
    int channel;
    /*
    public DmbCellPhone() {}
    public DmbCellPhone(int channel) {
        this.channel = channel;
    }
    */

    public DmbCellPhone(String model, String color, int channel) {
        // super();     이 경우가 아닌 경우 -> 부모가 기본 생성자가 없을 때
        super();
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    /*
    객체에 은닉화된 멤버 필드에
    값을 넣을 수 있는 방법 2가지
    1. setter 메소드를 이용해서 객체에 값을 넣는다.
    2. 생성자를 이용해서 객체에 값을 넣는다.

    객체에 은닉화된 멤버 필드에
    값을 빼내는 방법 1가지
    1. getter 메소드를 이용해서 값을 빼낸다.
     */

    @Override
    void printInfo() {
        super.printInfo();
        System.out.printf(", channel : %d\n", channel);
    }

}