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
public class GiaoVien extends CaNhan{
    String monDay, toBoMon;

    public GiaoVien(String monDay, String toBoMon, String hoTen, String diaChi, String sdt, int tuoi) {
        super(hoTen, diaChi, sdt, tuoi);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    @Override
    public String hienThiTT() {
        return "Họ tên giáo viên: "+this.hoTen+
                "\nTuổi: "+this.tuoi+
                "\nĐịa chỉ: "+this.diaChi+
                "\nSố điện thoại: "+this.sdt+
                "\nMôn dạy: "+this.monDay+
                "\nTổ bộ môn: "+this.toBoMon;
    }
    
}
