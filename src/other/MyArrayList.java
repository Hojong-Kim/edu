package other;

public class MyArrayList {
    private int[] arr;

    public MyArrayList() {
        arr = new int[0];
    }

    public void add(int val) {  // val =  20
        int[] temp = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        temp[arr.length] = val;
        arr = temp;
    }

    public int size() {
        return arr.length;
    }

    public void print() {
        System.out.println("[");
        for (int i = 0; i < arr.length; i++) {
            if(i != 10) {
                System.out.print(arr[i]);
            }
        }
        System.out.print("]");
    }
}
