/* Bài 1: Viết khai báo một gói chứa hai lớp: lớp hình vuông, lớp hình tròn. Viết khai báo lớp hình vuông, lớp hình tròn cùng các thuộc tính thích hợp, các phương thức get/set thích hợp. */

package week3;

public class Circle {
    private double radius;

    public Circle(){}

    // Getter
    public double getRadius(){
        return radius;
    }

    // Setter
    public void setRadius(double radius){
        this.radius = radius;
    }
}