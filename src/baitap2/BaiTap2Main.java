/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

/**
 *
 * @author PC
 */
public class BaiTap2Main 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        HangHoa hangHoa1 = new HangHoa("Tai Phone Airpod", 550000, "Tai Phone");
        HangHoa hangHoa2 = new HangHoa("Điện Thoại SamSung S20 Ultra", 30000000, "Điện Thoại");
        GioHang gioHang1 = new GioHang();
        gioHang1.themHH(hangHoa1);
        gioHang1.themHH(hangHoa2);
        gioHang1.setHinhThucTT(new ThanhToanCOD());
        gioHang1.inDSHH();
        System.out.println("Tiền khách phải trả: "+gioHang1.getThanhToan(gioHang1.getTienHang())+"\n");
        
        HangHoa hangHoa3 = new HangHoa("LapTop Hp", 1300000, "Máy Tính");
        HangHoa hangHoa4 = new HangHoa("TV Sony", 20000000, "TV");
        GioHang gioHang2 = new GioHang();
        gioHang2.themHH(hangHoa3);
        gioHang2.themHH(hangHoa4);
        gioHang2.setHinhThucTT(new ThanhToanOnline());
        gioHang2.inDSHH();
        System.out.println("Tiền khách phải trả: "+gioHang2.getThanhToan(gioHang2.getTienHang()));
                
    }
    
}
