package com.javacore.syntax.Java39;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//       khai báo mảng kiểu thường
        int[] mang = new int[5];

//        khai bo mảng kiểu dữ liệu obj
        Nhanvien[] nhanvien = new Nhanvien[2];

        for(int i = 0; i < nhanvien.length; i++)
        {
            System.out.println("nhap ten nhan vien thu " + i +" : ");
            String ten = input.nextLine();

            System.out.println("nhap dia chi nhan vien thu " + i +" : ");
            String diachi = input.nextLine();

            System.out.println("nhap tuoi nhan vien thu " + i +" : ");
            int tuoi = input.nextInt();

//           gán biến để tạo constructor thứ 2 để lưu lại giá trị
//            ở đây "ten" và "diachi" không để trong dấu  ngoặc là do nó có kiểu STRING sẵn rồi
            nhanvien[i] = new Nhanvien(ten, diachi, tuoi);

//            xóa bộ nhớ đệm
            input.nextLine();

        }

//        foreach( < kiểu dữ liệu > tên biến : tên mảng) : biến sẽ tự chạy hết mảng không cần biết chiều dài mảng
        for (Nhanvien nv : nhanvien)
        {
//          nv có kiểu là Nhanvien (constructor có kiểu sẵn rồi ) rồi nên không cần phải trỏ toString nữa
            System.out.println("nhan vien thu " +  nv);

        }
    }
}
