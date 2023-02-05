package com.syntax.jmaster.Java39;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//       khai báo mảng kiểu thường
//        int[] mang = new int[5];

        System.out.println("nhap so luong nhan vien ");
        int sonhanvien = input.nextInt();

//       do hàm nextInt sẽ có kí tự xuống dòng nên phải xóa kí tự xuống dòng bằng cách xóa cache
//       xóa bộ nhớ đệm
        input.nextLine();
//        khai báo mảng kiểu dữ liệu obj
        Nhanvien[] nhanvien = new Nhanvien[sonhanvien];
//      nếu i = 1 thì đang thiếu phần tử đầu tiên (thứ 0) trong mảng
//      và cố gắng lấy phần tử thứ 10 (không có mặt) và nó ném Array Index Out Of Bounds Exception.
        for(int i = 0 ; i < nhanvien.length ; i++)
        {

            System.out.println("nhap ten nhan vien thu " + (int)(i+1) +" : ");
            String tennhanvien = input.nextLine();

            System.out.println("nhap dia chi nhan vien thu " + (int)(i+1) +" : ");
            String diachi = input.nextLine();

            System.out.println("nhap tuoi nhan vien thu " + (int)(i+1) +" : ");
            int tuoi = input.nextInt();

//           gán biến để tạo constructor thứ 2 để lưu lại giá trị
//            ở đây "ten" và "diachi" không để trong dấu  ngoặc là do nó có kiểu STRING sẵn rồi
            nhanvien[i] = new Nhanvien( tennhanvien , diachi, tuoi);

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
