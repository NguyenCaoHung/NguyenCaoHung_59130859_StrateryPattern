/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author PC
 */
public class BaiTap1Main 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        context soHoc1 = new context();
        soHoc1.setTinhToan(new Cong());
        System.out.println(soHoc1.tinh(75, 12));
        context soHoc2 = new context();
        soHoc2.setTinhToan(new Tru());
        System.out.println(soHoc2.tinh(54, 78));
        
    }
    
}
