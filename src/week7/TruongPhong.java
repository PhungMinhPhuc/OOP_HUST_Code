package week7;

public class TruongPhong extends NhanVien {
    private double phuCap;
    private double soNamDuongChuc;

    public TruongPhong(String tenNhanVien, double luongCoBan, double heSoLuong, double phuCap, double soNamDuongChuc){
        super(tenNhanVien, luongCoBan, heSoLuong);
        this.phuCap = phuCap;
        this.soNamDuongChuc = soNamDuongChuc;
    }

    @Override
    public void inTTin(){
        super.inTTin();
        System.out.println("Phu cap: " + phuCap);
        System.out.println("So Nam Duong Chuc: " + soNamDuongChuc);
    }

    @Override
    public double tinhluong(){
        return super.tinhluong() + phuCap;
    }
    
}
