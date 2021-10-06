package ch07;

public class AnimalTest4 {
    public static void main(String[] args) {
        Animal ani = new Cat();
        Cat cat = (Cat)ani;
        BigCat bc = (BigCat)cat;
        bc.sleep();
        // Animal, Cat, Object

//        int result = 10 / 0;    // 런타임 에러
    }
}
