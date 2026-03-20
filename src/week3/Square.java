/* Bài 1: Viết khai báo một gói chứa hai lớp: lớp hình vuông, lớp hình tròn. Viết khai báo lớp hình vuông, lớp hình tròn cùng các thuộc tính thích hợp, các phương thức get/set thích hợp. */

package week3;

public class Square {
    private double side;

    public Square(){}

    // Getter / Accessor
    public double getSide() {
        return side;
    }

    // Setter
    public void setSide(double side) {
        this.side = side;
    }
}