/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlykho;

/**
 *
 * @author DINH CHAU
 */
public class NuocUong extends ThucPham {
    private String LoaiNuoc;

    
    public NuocUong(){
        
    }

    public NuocUong(String LoaiNuoc) {
        this.LoaiNuoc = LoaiNuoc;
    }

    public NuocUong(String LoaiNuoc, String MaSP, String TenSP, int Soluong, double gia, int NSX, int HSD) {
        super(MaSP, TenSP, Soluong, gia, NSX, HSD);
        this.LoaiNuoc = LoaiNuoc;
    }



    public String getLoaiNuoc() {
        return LoaiNuoc;
    }

    public void setLoaiNuoc(String LoaiNuoc) {
        this.LoaiNuoc = LoaiNuoc;
    }

    @Override
    public String toString() {
        return super.toString()+"NuocUong{" + "LoaiNuoc=" + LoaiNuoc + '}';
    }
    
    @Override
    public void SoNgaySD(){
        int SN = this.getHSD()- this.getNSX();
        System.out.println("So ngay bao quan cua san pham nuoc uong nay la: " + SN);
    }
    
    
    @Override
    public void SuDung(){
        System.out.println("Bao quan theo thoi han va nhiet do phu hop.");
    }
}
