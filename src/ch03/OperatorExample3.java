package ch03;

public class OperatorExample3 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 10;
        int n3 = 20;
        int n4 = 20;

        boolean result1 = n1 >= n2; //true
        boolean result2 = n3 > n4; //false

        System.out.println(result1 && result2); //&&: and
        System.out.println(result1 || result2); //||: or

        System.out.println(true && true && false && true && true); //false
        //false가 나오기 높은 대상을 앞쪽으로 배치하는 게 효율적이다.
        System.out.println(n1 >= n2 || n3 < n4 || n1 > n4); //true
    }
}
