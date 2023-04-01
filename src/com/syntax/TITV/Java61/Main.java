package com.syntax.TITV.Java61;

import com.syntax.TITV.Java61.main.Danhsach;
import com.syntax.TITV.Java61.main.SinhVien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Binh
 * Date : 3/4/2023 - 8:33 AM
 * Description : Java 61. Bài tập quản lý danh sách sinh viên trong Java sử dụng ArrayList
 */
public class Main {
    public static void main(String[] args) {
        Danhsach ds = new Danhsach();
        Scanner input = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("------------------------------");
            System.out.println("--MENU--");
            System.out.println("1. ThemSinhVien");
            System.out.println("2. In danh sach");
            System.out.println("3. Kiem tra danh sach");
            System.out.println("4. Lay so luong sinh vien");
            System.out.println("5. Lam rong danh sach");
            System.out.println("6. Kiem tra sinh vien co trong ds");
            System.out.println("7. Xoa sinh vien");
            System.out.println("8. Tim kiem sinh vien");
            System.out.println("9. Xuat ds co diem tu cao den thap");
            System.out.println("0. Exit");
            System.out.println("------------------------------");


            choice = input.nextInt();
//            xóa bộ nhớ đệm
            input.nextLine();
            if(choice == 1){
                System.out.println("nhap mssv : "); String mssv=input.nextLine();
                System.out.println("Nhap ho va ten : "); String hovaten = input.nextLine();
                System.out.println("nhap nam sinh : "); double namsinh = input.nextDouble();
                System.out.println("Nhap diem trung binh : "); float dtb = input.nextFloat();

                SinhVien sv = new SinhVien(mssv,hovaten,namsinh,dtb);

                ds.themsinhvien(sv);
                System.out.println("--------------------------------");
                System.out.println("Ket qua sau khi xuat danh sach");
                ds.Xuatdanhsach();
            }
            else if(choice == 2) {
                ds.Xuatdanhsach();
            }
            else if(choice == 3) {
                System.out.println("Danh sach co rong khong : " + ds.Kiemtradanhsach());
            }
            else if (choice == 4) {
                System.out.println("So sinh vien hien tai : " + ds.laysinhvien());
            }
            else if (choice == 5) {
//              kiểu void nên không được in
                ds.lamrongds();
            }
            else if (choice == 6) {
                System.out.println("Nhap mssv : ");
                String masv = input.nextLine();
                SinhVien sv = new SinhVien(masv);
                System.out.println("danh sạch sinh vien : " + ds.Kiemtrasinhvien(sv));
            }
            else if (choice == 7) {
                System.out.println("Nhap mssv : ");
                String masv = input.nextLine();
                SinhVien sv = new SinhVien(masv);
                System.out.println("danh sach sau khi xoa sinh vien : " + ds.xoasinhvien(sv));
            }
            else if (choice == 8) {
                System.out.println("Nhap ho va ten : ");
                String hovaten = input.nextLine();
                SinhVien sv = new SinhVien(hovaten);
                ds.timsinhvien(hovaten);
            }
            else if (choice == 9) {
                ds.sapxepsinhvien();
                ds.Xuatdanhsach();
            }

        } while (choice != 0); // nhập vô là 0 thì sẽ thoát khỏi chương trình
    }
}
