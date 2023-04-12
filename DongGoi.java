/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlykho;

/**
 *
 * @author DINH CHAU
 */
public class DongGoi extends ThucPham{
    private String ChatLieu;

    
    public DongGoi(){
        
    }

    public DongGoi(String ChatLieu) {
        this.ChatLieu = ChatLieu;
    }

    public DongGoi(String ChatLieu, String MaSP, String TenSP, int Soluong, double gia, int NSX, int HSD) {
        super(MaSP, TenSP, Soluong, gia, NSX, HSD);
        this.ChatLieu = ChatLieu;
    }


    public String getChatLieu() {
        return ChatLieu;
    }

    public void setChatLieu(String ChatLieu) {
        this.ChatLieu = ChatLieu;
    }

    @Override
    public String toString() {  
        return super.toString()+"DongGoi{" + "ChatLieu=" + ChatLieu + '}';
    }

    @Override
    public void SoNgaySD(){
        int SN = this.getHSD()- this.getNSX();
        System.out.println("So ngay bao quan cua san pham dong goi nay la: " + SN);
    }
    
    @Override
    public void SuDung(){
        System.out.println("Bao quan duoc trong thoi gian dai.");
    }
}
