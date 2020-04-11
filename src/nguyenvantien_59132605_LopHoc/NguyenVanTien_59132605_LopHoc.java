/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenvantien_59132605_LopHoc;

/**
 *
 * @author admin
 */
public class NguyenVanTien_59132605_LopHoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GiaoVien giaoVienCN = new GiaoVien("Gis", "CNTT", "Đoan Trang", "Nha Trang", "0123456789", 40);
        
        LopHoc lopHoc = new LopHoc(giaoVienCN);
        
        HocSinh hs = new HocSinh("59.CNTT-2", "Không", "Văn Tiến", "Vạn Giã", "0981530459", 22);
        HocSinh hs1 = new HocSinh("59.QTKD-1", "Hát", "Thị Tốt", "Vạn Bình", "0123456789", 22);
        HocSinh hs2 = new HocSinh("58.CNTT-1", "Lập trình", "Trần Sơn", "Nha Trang", "0987654321", 23);
        lopHoc.themHocSinh(hs);
        lopHoc.themHocSinh(hs1);
        lopHoc.themHocSinh(hs2);
        
        GiaoVien giaoVienGD = new GiaoVien("KTLT", "CNTT", "Đức Thuần", "Huế", "0321456987", 50);
        GiaoVien giaoVienGD1 = new GiaoVien("NMLT", "CNTT", "Vũ Thịnh", "Nha Trang", "0123654789", 40);
        lopHoc.themGVDG(giaoVienGD);
        lopHoc.themGVDG(giaoVienGD1);
        
        lopHoc.inDSGVGD();
        lopHoc.inDSHS();
        
        
    }
    
}
