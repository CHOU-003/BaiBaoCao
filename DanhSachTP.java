/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlykho;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import quanlykho.ThucPham;
/**
 *
 * @author DINH CHAU
 */
public class DanhSachTP {
    private ArrayList<ThucPham> Menu;

    Scanner sc = new  Scanner(System.in);
    // Khai báo 1 cái arraylist
    
    int chon =0;
    
   public DanhSachTP(){
       super();
       Menu = new ArrayList<ThucPham>();
   }
    
  public void NhapSP(int n)
    {
        do {  
        for(int i=0; i<n; i++){
            System.out.println("0: Thoat !!!");
            System.out.println("1: Thuc pham Dong Goi.");
            System.out.println("2: Thuc pham Tuoi.");
            System.out.println("3: Nuoc uong.");
            System.out.println("Nhap lua chon cu ban: ");
            chon = sc.nextInt();sc.nextLine();
            switch (chon){
                case 1:
                {
                    String MaSP;
                    String TenSP;
                    int Soluong;
                    double  gia;
                    String ChatLieu;
                    int NSX;
                    int HSD;
                    System.out.print("Nhap Ma san pham: "); MaSP = sc.nextLine();
                    System.out.print("Nhap ten san pham: "); TenSP = sc.nextLine();
                    System.out.print("Nhap so luong san pham: "); Soluong = sc.nextInt();
                    System.out.print("Nhap gia san pham: "); gia = sc.nextDouble();
                    System.out.print("Nhap chat lieu dong goi: "); ChatLieu = sc.next();
                    System.out.print("Nhap NSX: "); NSX = sc.nextInt();sc.nextLine();
                    System.out.print("Nhap HSD: "); HSD = sc.nextInt();sc.nextLine();
                    DongGoi dg = new  DongGoi(ChatLieu, MaSP, TenSP, Soluong, gia, NSX, HSD);
                    Menu.add(dg);
                }
                break;
                
                case 2:
                {
                    String MaSP;
                    String TenSP;
                    int Soluong;
                    double  gia;
                    String Loai;
                    int NSX;
                    int HSD;
                    System.out.print("Nhap Ma san pham: "); MaSP = sc.nextLine();
                    System.out.print("Nhap ten san pham: "); TenSP = sc.nextLine();
                    System.out.print("Nhap so luong san pham: "); Soluong = sc.nextInt();
                    System.out.print("Nhap gia san pham: "); gia = sc.nextDouble();
                    System.out.print("Nhap loai rau cu qua: "); Loai = sc.next();
                    System.out.print("Nhap NSX: "); NSX = sc.nextInt();sc.nextLine();
                    System.out.print("Nhap HSD: "); HSD = sc.nextInt();sc.nextLine();
                    Tuoi t = new  Tuoi(Loai, MaSP, TenSP, Soluong, gia, NSX, HSD);
                    Menu.add(t);
                }
                break;
                
                case 3:
                {
                    String MaSP;
                    String TenSP;
                    int Soluong;
                    double  gia;
                    String LoaiNuoc;
                    int NSX;
                    int HSD;
                    System.out.print("Nhap Ma san pham: "); MaSP = sc.nextLine();                            
                    System.out.print("Nhap ten san pham: "); TenSP = sc.nextLine();
                    System.out.print("Nhap so luong san pham: "); Soluong = sc.nextInt();
                    System.out.print("Nhap gia san pham: "); gia = sc.nextDouble();
                    System.out.print("Nhap loai nuoc uong: "); LoaiNuoc = sc.next();
                    System.out.print("Nhap NSX: "); NSX = sc.nextInt();sc.nextLine();
                    System.out.print("Nhap HSD: "); HSD = sc.nextInt();sc.nextLine();
                    NuocUong nu = new  NuocUong(LoaiNuoc, MaSP, TenSP, Soluong, gia, NSX, HSD);
                    Menu.add(nu);
                }
                break;
               
                }
            }
        } while (chon != 0);
        
}
    
    public void XuatDSThucPham(){
        for(ThucPham thucPham : Menu){
            System.out.println(thucPham.toString());
        }
    }

    public boolean xoaThucPham(String MaSP){
        for (ThucPham tp : Menu) {
         if (tp.getMaSP().equals(MaSP)) {
            return this.Menu.remove(tp);
        }
    }
        return false; 
    }
    
    public void sapxepMaSanPhamGiamDan() {
        Collections.sort(this.Menu, new Comparator<ThucPham>() {
            @Override
            public int compare(ThucPham tp1, ThucPham tp2) {
                if(tp1.getSoluong()<tp2.getSoluong()) {
                    return 1;
                }else if(tp1.getSoluong()>tp2.getSoluong()) {
                    return -1;
                }else {
                    return 0;
                }
            }
        });
    }
 
    public void sapxepMaSanPhamTangDan() {
       Collections.sort(this.Menu, new Comparator<ThucPham>() {
            @Override
            public int compare(ThucPham tp1, ThucPham tp2) {
                if(tp1.getSoluong()>tp2.getSoluong()) {
                    return 1;
                }else if(tp1.getSoluong()<tp2.getSoluong()) {
                    return -1;
                }else {
                    return 0;
                }
            }
        });
    }
    
    public void TimKiemTP(String ten){
        for(ThucPham tp : Menu){
            if(tp.getTenSP().indexOf(ten) >= 0){
                System.out.println(tp);
            }    
        }
    }
    
    public void Tong(){
        int DG = 0;
        int T = 0;
        int NU = 0;
        for (ThucPham tp : Menu) {
            if (tp instanceof DongGoi) {
                DG += tp.getSoluong();
            } else if (tp instanceof Tuoi) {
                T += tp.getSoluong();
            }else if (tp instanceof NuocUong) {
                NU += tp.getSoluong();
            }
            
        }
        System.out.println("Tong so luong thuc pham dong goi trong kho la: " + DG);
        System.out.println("Tong so luong thuc pham tuoi trong kho la: : " + T);
         System.out.println("Tong so luong nuoc uong trong kho la: : " + NU);
    }
    
     public void GiaCao(){
        for(ThucPham tp : Menu){
            if(tp.getGia() > 15000){
                System.out.println(tp.toString());
            }
        }
    }
     
    public void SoNgaySD(){
        for(ThucPham tp : Menu){
            tp.SoNgaySD();
        }
    }
    
}
