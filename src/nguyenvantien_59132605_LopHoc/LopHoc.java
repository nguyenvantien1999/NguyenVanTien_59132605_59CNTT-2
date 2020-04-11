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
public class LopHoc {

    GiaoVien giaoVienCN = new GiaoVien();
    
    QLDS qlDsGVGD = new QLDS();
    QLDS qlDsHS = new QLDS();
    
    public LopHoc(GiaoVien giaoVienCN) {
        this.giaoVienCN = giaoVienCN;
    }
    
    
    public int themHocSinh(HocSinh hs){
        if(qlDsHS.them(hs)==1)
            return 1;
        else
            return 0;
    }
    public int themGVDG(GiaoVien gv){
        if(qlDsGVGD.them(gv) == 1)
            return 1;
        else
            return 0;
    }
    public int inDSHS(){
        System.out.println("----------Danh sách học sinh---------");
        qlDsHS.inDS();
        return 1;
    }
    public int inDSGVGD(){
        System.out.println("----------Danh sách giáo viên---------");
        qlDsGVGD.inDS();
        return 1;
    }
}
