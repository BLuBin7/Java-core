package com.syntax.TITV.Java61.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Binh
 * Date : 3/4/2023 - 8:33 AM
 * Description :
 */
public class Danhsach {
    private ArrayList<SinhVien> danhsach;

    public Danhsach() {
//        tạo 1 list sinh viên
        this.danhsach = new ArrayList<SinhVien>();
    }

    public Danhsach(ArrayList<SinhVien> danhsach) {
        this.danhsach = danhsach;
    }

//    1. ThemSinhVien
    public void themsinhvien(SinhVien sv){
        this.danhsach.add(sv);
    }

//    2. In danh sach
    public void Xuatdanhsach(){
//        cách in 1
        for (SinhVien sinhvien : danhsach) {
            System.out.println(sinhvien.toString());
        }
//        cách in 2
//        System.out.println(Arrays.toString(this.danhsach.toArray()));
    }

//    3. Kiem tra danh sach
    public boolean Kiemtradanhsach(){
        return this.danhsach.isEmpty();
    }

//    4. Lay so luong sinh vien
    public int laysinhvien(){
        return this.danhsach.size();
    }

//    5. Lam rong danh sach
    public void lamrongds(){
        this.danhsach.removeAll(danhsach);
    }

//    6. Kiem tra sinh vien co trong ds
    public boolean Kiemtrasinhvien(SinhVien sv){
//        hàm contains giúp kiếm tra có chứa "sv" hay không
        return this.danhsach.contains(sv);
    }

//    7. Xoa sinh vien
    public boolean xoasinhvien(SinhVien sv){
        return this.danhsach.remove(sv);
    }

//    8. Tim kiem sinh vien
    public void timsinhvien(String ten) {
        for (SinhVien sv :
                danhsach) {
            if (sv.getHovaten().indexOf(ten) >= 0) {
                System.out.println(sv.toString());
            }
        }
    }

//    9. Xuat ds co diem tu cao den thap
    public void sapxepsinhvien(){
//   Comparator để cho biết khi 2 ọn gặp nhau thì obj nào đứng trước, đứng sau
        Collections.sort(this.danhsach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if(sv1.getDtb() < sv2.getDtb()){
                    return 1;
                }else if(sv1.getDtb() > sv2.getDtb()) {
                    return -1;
                }else {
                    return 0;
                }
            }
        });

    }

}
