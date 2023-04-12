/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlykho;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class ThucPham implements Comparable<ThucPham>{
    private String MaSP;
    private String TenSP;
    private int Soluong;
    private double  gia;
    private int NSX;
    private int HSD;
    
    public ThucPham(){
        
    }

    public ThucPham(String MaSP, String TenSP, int Soluong, double gia, int NSX, int HSD) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.Soluong = Soluong;
        this.gia = gia;
        this.NSX = NSX;
        this.HSD = HSD;
    }
    
    // Tạo các phương thức get/setter

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }
    
    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getNSX() {
        return NSX;
    }

    public void setNSX(int NSX) {
        this.NSX = NSX;
    }

    public int getHSD() {
        return HSD;
    }

    public void setHSD(int HSD) {
        this.HSD = HSD;
    }



    @Override
    public String toString() {
        return "ThucPham{" + "MaSP=" + MaSP + ", TenSP=" + TenSP + ", Soluong=" + Soluong + ", gia=" + gia + ", NSX=" + NSX + ", HSD=" + HSD + '}';
    }
    

     public void ThucPham(String MaSP){
        this.MaSP = MaSP;
    }
     
    public void SuDung(){
        System.out.println("Huong dan bao quan: ");
    }

    public void SoNgaySD(){
        System.out.println("San pham su dung trong.");
    }

    public ThucPham(String MaSP){
        this.MaSP = MaSP;
    }
    
    @Override
    public int compareTo(ThucPham o) {
       return this.MaSP.compareTo(o.MaSP);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(MaSP, TenSP);
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ThucPham other = (ThucPham) obj;
        return Objects.equals(MaSP, other.MaSP);
    }
 
     
}
