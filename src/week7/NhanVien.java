package week7;

public class NhanVien {
    protected String tenNhanVien;
    protected double luongCoBan;
    protected double heSoLuong;
    public final double LUONG_MAX = 20000000;
    public final double LUONG_CO_BAN = 750000

    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong){
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public void inTTin(){
        System.out.println("Ten nhan vien: " + tenNhanVien);
        System.out.println("Luong co ban: " + luongCoBan);
        System.out.println("He so luong: " + heSoLuong);
        System.out.println("Luong max: " + LUONG_MAX);
    }

    public double tinhluong(){
        return heSoLuong*luongCoBan;
    }
    
    public boolean tangLuong(){
        if(tinhluong() < LUONG_MAX) return true;
        else return false;
    }

    // Setter
    public void setName(String name){
        tenNhanVien = name;
    } 
    public void setBS(double BS){
        luongCoBan = BS;
    } 
    public void setHSL(double HSL){
        heSoLuong = HSL;
    } 
    
    // Getter
    public String getName(String name){
        return name;
    } 
    public double getBS(double luongCoBan){
        return luongCoBan;
    } 
    public double getHSL(double heSoLuong){
        return heSoLuong;
    } 
    public double getLM(double LUONG_MAX){
        return LUONG_MAX;
    } 
}