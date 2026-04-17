package week7;

public class CanBoQuanLy extends NhanVien implements IQuanLy{
    public CanBoQuanLy(String tenNhanVien, double luongCoBan, double heSoLuong){
        super(tenNhanVien, luongCoBan, heSoLuong);
    }

    @Override
    public void inTTin(){
        super.inTTin();
    }

    @Override
    public double tinhHoaHong(){
        return loiNhuanCongTy*0.02;
    }

    @Override
    public double tinhluong(){
        return super.tinhluong();
    }
    
}
