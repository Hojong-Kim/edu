package ch07;

public abstract class Animal {
    public void crying() {
        System.out.println("동물이 울다.");
    }

    public abstract void eat();

    /*
    class 키워드 왼족에 abstract를 붙이면 추상 클래스가 된다. (옵션)
    추상 클래스가 되면 객체화 불가능.

    추상 메소드가 해당 클래스에 1개라도 존재하면 그 클래스는 추상 클래스가 되어야 한다.
    (abstract 키워드 반드시 붙여야 함.)

    추상 메소드는 강제성이 있다. 자식 클래스는 추상 메소드를 반드시 구현해야(오버라이딩) 한다.
     */
}
