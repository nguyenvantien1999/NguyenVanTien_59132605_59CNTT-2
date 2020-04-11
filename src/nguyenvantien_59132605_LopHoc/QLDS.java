/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenvantien_59132605_LopHoc;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class QLDS implements IQLDS{

    ArrayList<CaNhan> listCaNhan = new ArrayList<>();
        
    @Override
    public int them(CaNhan p) {
        listCaNhan.add(p);
        return 1;
    }

    @Override
    public int xoa(String ten) {
        var removeIf = listCaNhan.removeIf((CaNhan p) -> p.getHoTen().equals(ten));
        if(removeIf == true)
            return 1;
        else
            return 0;
    }

    @Override
    public void inDS() {
        for(int i = 0; i < listCaNhan.size(); i++){
            System.out.println(listCaNhan.get(i).hienThiTT());
            System.out.println("---------------------------");
        }
    }
    
}
