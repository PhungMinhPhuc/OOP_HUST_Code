package week7;

public class GiamDoc extends NhanVien implements IQuanLy{
    private double phuCap;
    public static double loiNhuanCongTy;
    
    public GiamDoc(String tenNhanVien, double luongCoBan, double heSoLuong, double phuCap){
        super(tenNhanVien, luongCoBan, heSoLuong);
        this.phuCap = phuCap;
        this.loiNhuanCongTy = loiNhuanCongTy;
    }

    @Override
    public void inTTin(){
        super.inTTin();
        System.out.println("Phu cap: " + phuCap);
        System.out.println("Loi Nhuan Cong Ty: " + loiNhuanCongTy);
    }

    @Override
    public double tinhHoaHong(){
        return loiNhuanCongTy*0.05;
    }

    @Override
    public double tinhLuong(){
        return super.tinhLuong() + phuCap + tinhHoaHong();
    }
}
