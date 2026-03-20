/* Bài 2: Viết khai báo một lớp Vector gồm 3 thành phần với những phương thức cộng/trừ vector, nhân với 1 hằng số, nhân vô hướng 2 vector. */

package week3;

public class Vector {
    private double x, y, z, k;

    public Vector(){}

    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Setter
    public void setVector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setConst(double k){
        this.k = k;
    }

    // Getter
    public Vector addVector (Vector v1, Vector v2){
        return new Vector (v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
    }

    public Vector scalarVec(double k){
        return new Vector (k*x, k*y, k*z);
    }

    public double dotProduct(Vector v1, Vector v2){
        return v1.x * v2.x + v1.y * v2.y + v1.z * v2.z;
    }
}