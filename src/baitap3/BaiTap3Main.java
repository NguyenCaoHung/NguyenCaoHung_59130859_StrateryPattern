/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author PC
 */
public class BaiTap3Main 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        QLSV dsSinhVien = new QLSV();
        
        SinhVien sinhVien1 = new SinhVien("Hồ Trúc An", "24-03-1999", 7.0f);
        dsSinhVien.themSV(sinhVien1);
        SinhVien sinhVien2 = new SinhVien("Hồ Thanh Thái", "11-10-1999", 8.5f);
        dsSinhVien.themSV(sinhVien2);
        SinhVien sinhVien3 = new SinhVien("Nguyễn Tấn Lân", "06-07-1999", 5.5f);
        dsSinhVien.themSV(sinhVien3);
        
        dsSinhVien.setSoSanh(new SoSanhTheoDiem());
        dsSinhVien.sapXep();
        System.out.println("Sắp Xếp Điểm:");
        dsSinhVien.inDS();
        
        dsSinhVien.setSoSanh(new SoSanhTheoTen());
        dsSinhVien.sapXep();
        System.out.println("Sắp Xếp Tên:");
        dsSinhVien.inDS();
    }
    
}
