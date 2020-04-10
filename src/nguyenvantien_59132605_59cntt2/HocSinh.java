/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenvantien_59132605_59cntt2;

/**
 *
 * @author admin
 */
public class HocSinh extends CaNhan{
    String lop, nangKhieu;

    public HocSinh(String lop, String nangKhieu, String hoTen, String diaChi, String sdt, int tuoi) {
        super(hoTen, diaChi, sdt, tuoi);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }
    
    @Override
    public String hienThiTT() {
        return "Họ tên học sinh: "+this.hoTen+
                "\nTuổi: "+this.tuoi+
                "\nĐịa chỉ: "+this.diaChi+
                "\nSố điện thoại: "+this.sdt+
                "\nLớp: "+this.lop+
                "\nNăng khiếu: "+this.nangKhieu;
    }
    
}
