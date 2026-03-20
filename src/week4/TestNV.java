package week4;

public class TestNV {
    public static void main(String[] args){
        NhanVien nv1 = new NhanVien("Phung", 190, 1.8);
        NhanVien nv2 = new NhanVien("Minh", 200, 1.5);
        
        nv1.inTTin();
        System.out.println(nv1.tinhluong());
        System.out.println(nv1.tangLuong());
        nv2.inTTin();
        System.out.println(nv2.tinhluong());
        System.out.println(nv2.tangLuong());
    }
}
