/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlykho;

/**
 *
 * @author DINH CHAU
 */
public class Tuoi extends ThucPham{
    private String Loai;


    public Tuoi() {
    }

    public Tuoi(String Loai) {
        this.Loai = Loai;
    }

    public Tuoi(String Loai, String MaSP, String TenSP, int Soluong, double gia, int NSX, int HSD) {
        super(MaSP, TenSP, Soluong, gia, NSX, HSD);
        this.Loai = Loai;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    @Override
    public String toString() {
        return super.toString()+"Tuoi{" + "Loai=" + Loai + '}';
    }

    @Override
    public void SoNgaySD(){
        int SN = this.getHSD()- this.getNSX();
        System.out.println("So ngay bao quan cua san pham tuoi nay la: " + SN);
    }
    


    @Override
    public void SuDung(){
        System.out.println("Bao quan trong thoi gian ngan.");
    }
    
}
