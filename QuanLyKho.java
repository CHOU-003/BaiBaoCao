/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlykho;

import java.util.Scanner;
import java.util.Date;
import quanlykho.ThucPham;
import quanlykho.DanhSachTP;

public class QuanLyKho {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        DanhSachTP dstp = new DanhSachTP();
        int chon = 0;
                
        ThucPham t = new ThucPham();
        t.SuDung();
        
        t = new Tuoi();
        t.SuDung();
        
        t = new DongGoi();
        t.SuDung();
        
        t = new NuocUong();
        t.SuDung();
        do {
            System.out.println("-----------DANH SACH THUC PHAM----------");
            System.out.println("Chon chuc nang");
            System.out.println("0. Thoat khoi man hinh nhap.\n"
            + "1. Them Thuc Pham vao Menu.\n"
            + "2. Xuat menu thuc pham.\n"
            + "3. Xoa mot san pham trong menu. \n"
            + "4. Sap xep san pham giam dan theo so luong.\n"
            + "5. Sap xep san pham tang dan theo so luong.\n"
            + "6. Tim kiem san pham trong menu theo ten. \n"
            + "7. Tong so luong cua san pham trong kho. \n"
            + "8. San pham co gia thanh lon hon 15000. \n"
            + "9. So ngay su dung cua san pham. \n");
            System.out.print("Lua chon cua ban la: ");
          chon = sc.nextInt();
          sc.nextLine();
          
          if(chon == 0){}
          else if(chon ==1){     
              dstp.NhapSP(chon);
          }
          else if(chon ==2){
              dstp.XuatDSThucPham();
          }    
          else if(chon ==3){
              System.out.print("Nhap vao ma thuc pham ma ban muon xoa: ");
              String MaSP = sc.nextLine();//sc.nextLine();
              ThucPham tp = new ThucPham(MaSP);
              System.out.println("Xoa thuc pham: " + dstp.xoaThucPham(MaSP));
			}
          else if(chon ==4){
              dstp.sapxepMaSanPhamGiamDan();
              dstp.XuatDSThucPham();
          }
          else if(chon ==5){
              dstp.sapxepMaSanPhamTangDan();
              dstp.XuatDSThucPham();
          }
          else if(chon ==6){
              System.out.print("Nhap ten thuc pham muon tim: "); String TenSP = sc.next();
              System.out.println("Thuc pham tim duoc la: ");
              dstp.TimKiemTP(TenSP);
          }
          else if(chon == 7){
              dstp.Tong();
          }
          else if(chon == 8){
              dstp.GiaCao();
          }
          else if(chon == 9){
              dstp.SoNgaySD();
          }
          
        } while (chon !=0);

    }
    
}
