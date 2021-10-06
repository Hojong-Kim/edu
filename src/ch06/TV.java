package ch06;

public class TV {
    private String brand;   // = null
    private int inch;       // = 0

    public TV() {}      // 생성자를 통해서 값을 넣을 수 있다.

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }       // setter를 통해서 값을 넣을 수 있다.

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    // getters, setters
    // 마우스 우클릭 -> Generate -> Getter and Setter
}
